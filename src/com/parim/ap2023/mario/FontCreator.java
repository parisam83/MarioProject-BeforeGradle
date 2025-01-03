package com.parim.ap2023.mario;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontCreator {
    private final static File fontFile = new File("AGENCYB.ttf");
    public final static Font font;

    static {
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public final static Font titleFont = font.deriveFont(70f);
    public final static Font buttonFont = font.deriveFont(40f);

}
