package com.ginger.wight;

import android.graphics.fonts.Font;

public class FontNote {

    //内容
    String substance;

    //字体
    Font font;

    public FontNote(String substance, Font font) {
        this.substance = substance;
        this.font = font;
    }

    public String getSubstance() {
        return substance;
    }

    public Font getFont() {
        return font;
    }
}
