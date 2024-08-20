package org.example;

import java.util.ArrayList;
import java.util.List;

public class ThemeController {
    private List<Theme> themes;
    public ThemeController() {
        this.themes = new ArrayList<Theme>();
    }
    public void addTheme(Theme theme) {
        this.themes.add(theme);
    }
    public void removeTheme(Theme theme) {
        this.themes.remove(theme);
    }
    public List<Theme> getThemes() {
        return themes;
    }
    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }
}
