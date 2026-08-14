package com.iwamih31;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UserListWorkSheet_getColumnWidth_6480587118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28618;

    public UserListWorkSheet_getColumnWidth_6480587118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28618 = newInstance(Class.forName("com.iwamih31.UserListWorkSheet"));
        Object[] term28949 = (Object[]) newArray("java.lang.String", 8);
        Object[] term28982 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29015 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29048 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29081 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29114 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29147 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29180 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29213 = (Object[]) newArray("java.lang.String", 8);
        Object[] term29246 = (Object[]) newArray("java.lang.String", 8);
        int[] term29291 = (int[]) newIntArray(0);
        Object[] term29292 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term29293 = (Object[]) newArray("java.lang.String", 4);
        Object[] term29342 = (Object[]) newArray("java.lang.String", 9);
        Object[] term29451 = (Object[]) newArray("java.lang.String", 3);
        Object[] term29488 = (Object[]) newArray("java.lang.String", 1);
        setElement(term28949, 0, "  ");
        setElement(term28949, 1, "  ");
        setElement(term28949, 2, "  ");
        setElement(term28949, 3, "  ");
        setElement(term28949, 4, "  ");
        setElement(term28949, 5, "  ");
        setElement(term28949, 6, "  ");
        setElement(term28949, 7, "  ");
        setField(term28618, term28618.getClass(), "row_1_Border", term28949);
        setElement(term28982, 0, "  ");
        setElement(term28982, 1, "  ");
        setElement(term28982, 2, "  ");
        setElement(term28982, 3, "  ");
        setElement(term28982, 4, "  ");
        setElement(term28982, 5, "  ");
        setElement(term28982, 6, "  ");
        setElement(term28982, 7, "  ");
        setField(term28618, term28618.getClass(), "row_1_Align_", term28982);
        setElement(term29015, 0, "  ");
        setElement(term29015, 1, "  ");
        setElement(term29015, 2, "  ");
        setElement(term29015, 3, "  ");
        setElement(term29015, 4, "  ");
        setElement(term29015, 5, "  ");
        setElement(term29015, 6, "  ");
        setElement(term29015, 7, "  ");
        setField(term28618, term28618.getClass(), "row_2_Border", term29015);
        setElement(term29048, 0, "  ");
        setElement(term29048, 1, "  ");
        setElement(term29048, 2, "  ");
        setElement(term29048, 3, "  ");
        setElement(term29048, 4, "  ");
        setElement(term29048, 5, "  ");
        setElement(term29048, 6, "  ");
        setElement(term29048, 7, "  ");
        setField(term28618, term28618.getClass(), "row_2_Align_", term29048);
        setElement(term29081, 0, "  ");
        setElement(term29081, 1, "  ");
        setElement(term29081, 2, "  ");
        setElement(term29081, 3, "  ");
        setElement(term29081, 4, "  ");
        setElement(term29081, 5, "  ");
        setElement(term29081, 6, "  ");
        setElement(term29081, 7, "  ");
        setField(term28618, term28618.getClass(), "row_3_Border", term29081);
        setElement(term29114, 0, "  ");
        setElement(term29114, 1, "  ");
        setElement(term29114, 2, "  ");
        setElement(term29114, 3, "  ");
        setElement(term29114, 4, "  ");
        setElement(term29114, 5, "  ");
        setElement(term29114, 6, "  ");
        setElement(term29114, 7, "  ");
        setField(term28618, term28618.getClass(), "row_3_Align_", term29114);
        setElement(term29147, 0, "  ");
        setElement(term29147, 1, "  ");
        setElement(term29147, 2, "  ");
        setElement(term29147, 3, "  ");
        setElement(term29147, 4, "  ");
        setElement(term29147, 5, "  ");
        setElement(term29147, 6, "  ");
        setElement(term29147, 7, "  ");
        setField(term28618, term28618.getClass(), "label_Border", term29147);
        setElement(term29180, 0, "  ");
        setElement(term29180, 1, "  ");
        setElement(term29180, 2, "  ");
        setElement(term29180, 3, "  ");
        setElement(term29180, 4, "  ");
        setElement(term29180, 5, "  ");
        setElement(term29180, 6, "  ");
        setElement(term29180, 7, "  ");
        setField(term28618, term28618.getClass(), "label_Align_", term29180);
        setElement(term29213, 0, "  ");
        setElement(term29213, 1, "  ");
        setElement(term29213, 2, "  ");
        setElement(term29213, 3, "  ");
        setElement(term29213, 4, "  ");
        setElement(term29213, 5, "  ");
        setElement(term29213, 6, "  ");
        setElement(term29213, 7, "  ");
        setField(term28618, term28618.getClass(), "data__Border", term29213);
        setElement(term29246, 0, "  ");
        setElement(term29246, 1, "  ");
        setElement(term29246, 2, "  ");
        setElement(term29246, 3, "  ");
        setElement(term29246, 4, "  ");
        setElement(term29246, 5, "  ");
        setElement(term29246, 6, "  ");
        setElement(term29246, 7, "  ");
        setField(term28618, term28618.getClass(), "data__Align_", term29246);
        setField(term28618, term28618.getClass(), "sheet_Name", "XjIOUIzJUP");
        setField(term28618, term28618.getClass(), "column_Width", term29291);
        setElement(term29293, 0, "iGTpXnnTqB");
        setElement(term29293, 1, "XgJzBOYfQB");
        setElement(term29293, 2, "GAPGgDekVG");
        setElement(term29293, 3, "WmTogHwGLE");
        setElement(term29292, 0, term29293);
        setElement(term29342, 0, "qYOIXsGycY");
        setElement(term29342, 1, "sJNXNshRLe");
        setElement(term29342, 2, "AYnbmgRCKr");
        setElement(term29342, 3, "iQRfDlaoYD");
        setElement(term29342, 4, "kpcyrjDQzN");
        setElement(term29342, 5, "IyukykAHLQ");
        setElement(term29342, 6, "CwZcgFJqMh");
        setElement(term29342, 7, "RldCZqgRbO");
        setElement(term29342, 8, "LOVugCAgJs");
        setElement(term29292, 1, term29342);
        setElement(term29451, 0, "SNmHXwCiFY");
        setElement(term29451, 1, "HZfkWoqyUW");
        setElement(term29451, 2, "QRwANPSyfT");
        setElement(term29292, 2, term29451);
        setElement(term29488, 0, "DbZKLwYBgy");
        setElement(term29292, 3, term29488);
        setField(term28618, term28618.getClass(), "value_Data", term29292);
        setBooleanField(term28618, term28618.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.UserListWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumn_Width", argTypes, term28618, args);
    }

};


