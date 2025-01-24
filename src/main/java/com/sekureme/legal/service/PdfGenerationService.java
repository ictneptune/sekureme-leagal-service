package com.sekureme.legal.service;

import org.springframework.stereotype.Service;

// import com.itextpdf.io.source.ByteArrayOutputStream;
// import com.itextpdf.kernel.pdf.PdfWriter;
// import com.itextpdf.layout.Document;
// import com.itextpdf.text.*;
// import com.itextpdf.text.pdf.*;
// import com.sekureme.legal.model.LegalDocument;

@Service
public class PdfGenerationService {

    // public byte[] generatePdf(LegalDocument document) throws DocumentException, IOException {
    //     Document pdfDoc = new Document();
    //     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    //     PdfWriter.getInstance(pdfDoc, byteArrayOutputStream);

    //     pdfDoc.open();
    //     pdfDoc.add(new Paragraph("Legal Document: " + document.getName()));
    //     pdfDoc.add(new Paragraph(document.getContent()));
    //     pdfDoc.close();

    //     return byteArrayOutputStream.toByteArray();
    // }
}
