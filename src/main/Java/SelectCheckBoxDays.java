/**
 * Created by SehrishRaza on 08/11/2015.
 */
public enum SelectCheckBoxDays {
    DAYS_MONDAY("gwt-debug-cwCheckBox-Monday-input"),
    DAYS_TUESDAY("gwt-debug-cwCheckBox-Tuesday-input"),
    DAYS_WEDNESDAY("gwt-debug-cwCheckBox-Wednesday-input"),
    DAYS_THURSDAY("gwt-debug-cwCheckBox-Thursday-input"),
    DAYS_FRIDAY("gwt-debug-cwCheckBox-Friday-input"),
    DAYS_SATURDAY("gwt-debug-cwCheckBox-Saturday-input"),
    DAYS_SUNDAY("gwt-debug-cwCheckBox-Sunday-input");
    private final String id;


    SelectCheckBoxDays(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
