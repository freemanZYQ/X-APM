package github.tornaco.xposedmoduletest.util;

import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by Nick@NewStand.org on 2017/5/2 11:13
 * E-Mail: NewStand@163.com
 * All right reserved.
 */

public class EmojiUtil {

    public static final int HAPPY = 0X1F60F;
    public static final int UNHAPPY = 0x1F625;
    public static final int BOOST = 0x1F680;

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    public static String getEmojiByUnicode(int unicode) {
        return new String(Character.toChars(unicode));
    }
}