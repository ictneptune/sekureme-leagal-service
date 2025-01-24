-- Ensure pgcrypto extension is enabled for encryption
--CREATE EXTENSION IF NOT EXISTS pgcrypto;
-- ------------------------
-- ENCRYPTION FUNCTIONS (For encrypting and decrypting data)
-- ------------------------

-- Function to Encrypt User Data (Before Insert)
CREATE OR REPLACE FUNCTION encrypt_user_data(
    p_email TEXT,
    p_first_name TEXT,
    p_last_name TEXT,
    p_encryption_key BYTEA
)
RETURNS TABLE (encrypted_email BYTEA, encrypted_first_name BYTEA, encrypted_last_name BYTEA) AS $$
BEGIN
    encrypted_email := pgp_sym_encrypt(p_email, p_encryption_key);
    encrypted_first_name := pgp_sym_encrypt(p_first_name, p_encryption_key);
    encrypted_last_name := pgp_sym_encrypt(p_last_name, p_encryption_key);
    RETURN;
END;
$$ LANGUAGE plpgsql;

-- Function to Decrypt User Data (Before Select)
CREATE OR REPLACE FUNCTION decrypt_user_data(
    p_encrypted_email BYTEA,
    p_encrypted_first_name BYTEA,
    p_encrypted_last_name BYTEA,
    p_encryption_key BYTEA
)
RETURNS TABLE (decrypted_email TEXT, decrypted_first_name TEXT, decrypted_last_name TEXT) AS $$
BEGIN
    decrypted_email := pgp_sym_decrypt(p_encrypted_email, p_encryption_key)::TEXT;
    decrypted_first_name := pgp_sym_decrypt(p_encrypted_first_name, p_encryption_key)::TEXT;
    decrypted_last_name := pgp_sym_decrypt(p_encrypted_last_name, p_encryption_key)::TEXT;
    RETURN;
END;
$$ LANGUAGE plpgsql;