package org.phphub.app.common.qualified;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;
import static org.phphub.app.common.qualified.ClickType.*;

@Retention(SOURCE)
@IntDef({
        CLICK_TYPE_USER_CLICKED,
        CLICK_TYPE_TOPIC_CLICKED
})
public @interface ClickType {
    int CLICK_TYPE_USER_CLICKED = 1000;

    int CLICK_TYPE_TOPIC_CLICKED = 1001;
}