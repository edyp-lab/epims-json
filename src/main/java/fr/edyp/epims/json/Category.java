package fr.edyp.epims.json;

public enum Category {
    EDyP_SERVICE,
    COLLAB_RESEARCH,
    INTERNAL_RESEARCH,
    DEVELOPMENT,
    QC,
    EXTERNAL,
    BLANK,
    LC_CTRL;

    public static Category[] getStudyCategories() {
        return new Category[] {
            EDyP_SERVICE,
            COLLAB_RESEARCH,
            INTERNAL_RESEARCH,
            DEVELOPMENT,
            QC,
            EXTERNAL
        };
    }
}
