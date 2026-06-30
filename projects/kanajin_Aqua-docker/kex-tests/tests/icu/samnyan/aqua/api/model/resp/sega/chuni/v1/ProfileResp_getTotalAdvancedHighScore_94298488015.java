package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getTotalAdvancedHighScore_94298488015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;

    public ProfileResp_getTotalAdvancedHighScore_94298488015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1303 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1246, term1246.getClass(), "userName", "OWDIEULEFu");
        setIntField(term1246, term1246.getClass(), "level", -243422082);
        setField(term1246, term1246.getClass(), "exp", "dWRymuLBtr");
        setLongField(term1246, term1246.getClass(), "point", -5786861555969446503L);
        setLongField(term1246, term1246.getClass(), "totalPoint", 2354625302846375590L);
        setIntField(term1246, term1246.getClass(), "playCount", 1384592638);
        setIntField(term1246, term1246.getClass(), "playerRating", -1002370457);
        setIntField(term1246, term1246.getClass(), "highestRating", -2014576105);
        setIntField(term1246, term1246.getClass(), "nameplateId", 1296895584);
        setIntField(term1246, term1246.getClass(), "frameId", 628918458);
        setIntField(term1246, term1246.getClass(), "characterId", -1274456137);
        setIntField(term1246, term1246.getClass(), "trophyId", 1041916673);
        setIntField(term1246, term1246.getClass(), "totalMapNum", -601863069);
        setLongField(term1246, term1246.getClass(), "totalHiScore", 7276637106827860087L);
        setLongField(term1246, term1246.getClass(), "totalBasicHighScore", -3936701866695933852L);
        setLongField(term1246, term1246.getClass(), "totalAdvancedHighScore", 1215116475929634177L);
        setLongField(term1246, term1246.getClass(), "totalExpertHighScore", 1597484336218508869L);
        setLongField(term1246, term1246.getClass(), "totalMasterHighScore", -685023850445639859L);
        setIntField(term1246, term1246.getClass(), "friendCount", 663292551);
        setIntField(term1289, term1289.getClass(), "year", 2016);
        setShortField(term1289, term1289.getClass(), "month", (short) 6);
        setShortField(term1289, term1289.getClass(), "day", (short) 15);
        setField(term1288, term1288.getClass(), "date", term1289);
        setByteField(term1293, term1293.getClass(), "hour", (byte) 21);
        setByteField(term1293, term1293.getClass(), "minute", (byte) 23);
        setByteField(term1293, term1293.getClass(), "second", (byte) 23);
        setIntField(term1293, term1293.getClass(), "nano", 433372070);
        setField(term1288, term1288.getClass(), "time", term1293);
        setField(term1246, term1246.getClass(), "firstPlayDate", term1288);
        setIntField(term1299, term1299.getClass(), "year", 2012);
        setShortField(term1299, term1299.getClass(), "month", (short) 8);
        setShortField(term1299, term1299.getClass(), "day", (short) 25);
        setField(term1298, term1298.getClass(), "date", term1299);
        setByteField(term1303, term1303.getClass(), "hour", (byte) 19);
        setByteField(term1303, term1303.getClass(), "minute", (byte) 49);
        setByteField(term1303, term1303.getClass(), "second", (byte) 8);
        setIntField(term1303, term1303.getClass(), "nano", 912685024);
        setField(term1298, term1298.getClass(), "time", term1303);
        setField(term1246, term1246.getClass(), "lastPlayDate", term1298);
        setIntField(term1246, term1246.getClass(), "courseClass", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term1246, args);
    }

};


