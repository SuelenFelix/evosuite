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

public class ActualResultsWorkSheet_getSheetName_475768855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11354;

    public ActualResultsWorkSheet_getSheetName_475768855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11354 = newInstance(Class.forName("com.iwamih31.ActualResultsWorkSheet"));
        Object[] term11785 = (Object[]) newArray("java.lang.String", 5);
        Object[] term11846 = (Object[]) newArray("java.lang.String", 8);
        Object[] term11943 = (Object[]) newArray("java.lang.String", 8);
        Object[] term12040 = (Object[]) newArray("java.lang.String", 5);
        Object[] term12101 = (Object[]) newArray("java.lang.String", 6);
        Object[] term12174 = (Object[]) newArray("java.lang.String", 3);
        Object[] term12211 = (Object[]) newArray("java.lang.String", 0);
        Object[] term12212 = (Object[]) newArray("java.lang.String", 5);
        Object[] term12273 = (Object[]) newArray("java.lang.String", 6);
        Object[] term12346 = (Object[]) newArray("java.lang.String", 0);
        int[] term12359 = (int[]) newIntArray(3);
        Object[] term12363 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term12364 = (Object[]) newArray("java.lang.String", 9);
        setElement(term11785, 0, "IkfarsYNJO");
        setElement(term11785, 1, "aZKOWhHMEh");
        setElement(term11785, 2, "YfkhviKZwl");
        setElement(term11785, 3, "DcOhhAfJTI");
        setElement(term11785, 4, "gYTIkBFOoS");
        setField(term11354, term11354.getClass(), "row_1_Border", term11785);
        setElement(term11846, 0, "xmzSoVgiED");
        setElement(term11846, 1, "pdSvedKgPq");
        setElement(term11846, 2, "epPTwvcoyb");
        setElement(term11846, 3, "UBPHmOICBs");
        setElement(term11846, 4, "IDJUVPgUJf");
        setElement(term11846, 5, "JmnWRJUxGr");
        setElement(term11846, 6, "wgRGBNrTGP");
        setElement(term11846, 7, "FIdNVptZpW");
        setField(term11354, term11354.getClass(), "row_1_Align_", term11846);
        setElement(term11943, 0, "rQjxAhisjm");
        setElement(term11943, 1, "ZDhASPHjDG");
        setElement(term11943, 2, "HNVOAXYNEZ");
        setElement(term11943, 3, "gbbYBYyfvr");
        setElement(term11943, 4, "SrWMUlbtWV");
        setElement(term11943, 5, "VePIumgrrU");
        setElement(term11943, 6, "DPwIqlszZo");
        setElement(term11943, 7, "mNgDshwZNc");
        setField(term11354, term11354.getClass(), "row_2_Border", term11943);
        setElement(term12040, 0, "pDqgDbJoFw");
        setElement(term12040, 1, "iVOvTzOxwt");
        setElement(term12040, 2, "BjZQdecXvB");
        setElement(term12040, 3, "iUkOOQhEkw");
        setElement(term12040, 4, "wmVoFoUVmU");
        setField(term11354, term11354.getClass(), "row_2_Align_", term12040);
        setElement(term12101, 0, "lLiSiPCciB");
        setElement(term12101, 1, "PsMKIIEwdR");
        setElement(term12101, 2, "RbQmXqfXAT");
        setElement(term12101, 3, "fcCAsvfBbe");
        setElement(term12101, 4, "mUNcKUxghj");
        setElement(term12101, 5, "lnvLKbtveE");
        setField(term11354, term11354.getClass(), "row_3_Border", term12101);
        setElement(term12174, 0, "FfrrEhTHzQ");
        setElement(term12174, 1, "LXnDNrMsqT");
        setElement(term12174, 2, "ZLQamJFBmu");
        setField(term11354, term11354.getClass(), "row_3_Align_", term12174);
        setField(term11354, term11354.getClass(), "label_Border", term12211);
        setElement(term12212, 0, "ZWcOCwKNvd");
        setElement(term12212, 1, "GTmoNrziyc");
        setElement(term12212, 2, "LvztehSlhM");
        setElement(term12212, 3, "njvnWFTMxN");
        setElement(term12212, 4, "fLRqcTSfzF");
        setField(term11354, term11354.getClass(), "label_Align_", term12212);
        setElement(term12273, 0, "EBYHwsuWAU");
        setElement(term12273, 1, "PtIjKpiSix");
        setElement(term12273, 2, "NZdTuwSCIM");
        setElement(term12273, 3, "dDHcmzPAmP");
        setElement(term12273, 4, "HEaTkWYBgv");
        setElement(term12273, 5, "MpJsPKLTIU");
        setField(term11354, term11354.getClass(), "data__Border", term12273);
        setField(term11354, term11354.getClass(), "data__Align_", term12346);
        setField(term11354, term11354.getClass(), "sheet_Name", "IiNCZfdouL");
        setIntElement(term12359, 0, -226514366);
        setIntElement(term12359, 1, 1193880199);
        setIntElement(term12359, 2, -1087774327);
        setField(term11354, term11354.getClass(), "column_Width", term12359);
        setElement(term12364, 0, "AhOHzCsHKW");
        setElement(term12364, 1, "UqgLPaaAHi");
        setElement(term12364, 2, "xypryEkUPF");
        setElement(term12364, 3, "zyZTzHNjQr");
        setElement(term12364, 4, "YSrFKQQwXE");
        setElement(term12364, 5, "qxhOsmyyjm");
        setElement(term12364, 6, "DuKcNfVVYR");
        setElement(term12364, 7, "fRujHWvXjJ");
        setElement(term12364, 8, "EAIAAStlTz");
        setElement(term12363, 0, term12364);
        setField(term11354, term11354.getClass(), "value_Data", term12363);
        setBooleanField(term11354, term11354.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.ActualResultsWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSheet_Name", argTypes, term11354, args);
    }

};


