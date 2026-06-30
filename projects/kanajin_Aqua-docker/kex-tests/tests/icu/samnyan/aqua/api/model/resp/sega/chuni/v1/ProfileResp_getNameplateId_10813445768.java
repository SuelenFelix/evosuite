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

public class ProfileResp_getNameplateId_10813445768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public ProfileResp_getNameplateId_10813445768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term722 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term665, term665.getClass(), "userName", "ZiaGIbnzTs");
        setIntField(term665, term665.getClass(), "level", 1114000454);
        setField(term665, term665.getClass(), "exp", "tbcdzjIfER");
        setLongField(term665, term665.getClass(), "point", -7738503207562305297L);
        setLongField(term665, term665.getClass(), "totalPoint", 3825396310311739952L);
        setIntField(term665, term665.getClass(), "playCount", -556405712);
        setIntField(term665, term665.getClass(), "playerRating", -1772434990);
        setIntField(term665, term665.getClass(), "highestRating", -1845499264);
        setIntField(term665, term665.getClass(), "nameplateId", -505439934);
        setIntField(term665, term665.getClass(), "frameId", -344842608);
        setIntField(term665, term665.getClass(), "characterId", 941650513);
        setIntField(term665, term665.getClass(), "trophyId", 444029505);
        setIntField(term665, term665.getClass(), "totalMapNum", -1034506028);
        setLongField(term665, term665.getClass(), "totalHiScore", -3838084482494604218L);
        setLongField(term665, term665.getClass(), "totalBasicHighScore", 3892018155439224435L);
        setLongField(term665, term665.getClass(), "totalAdvancedHighScore", 5953383087795962419L);
        setLongField(term665, term665.getClass(), "totalExpertHighScore", 7994303628307559416L);
        setLongField(term665, term665.getClass(), "totalMasterHighScore", 2443640364875054177L);
        setIntField(term665, term665.getClass(), "friendCount", -1263114719);
        setIntField(term708, term708.getClass(), "year", 2015);
        setShortField(term708, term708.getClass(), "month", (short) 9);
        setShortField(term708, term708.getClass(), "day", (short) 16);
        setField(term707, term707.getClass(), "date", term708);
        setByteField(term712, term712.getClass(), "hour", (byte) 6);
        setByteField(term712, term712.getClass(), "minute", (byte) 19);
        setByteField(term712, term712.getClass(), "second", (byte) 42);
        setIntField(term712, term712.getClass(), "nano", 630084975);
        setField(term707, term707.getClass(), "time", term712);
        setField(term665, term665.getClass(), "firstPlayDate", term707);
        setIntField(term718, term718.getClass(), "year", 2029);
        setShortField(term718, term718.getClass(), "month", (short) 6);
        setShortField(term718, term718.getClass(), "day", (short) 23);
        setField(term717, term717.getClass(), "date", term718);
        setByteField(term722, term722.getClass(), "hour", (byte) 21);
        setByteField(term722, term722.getClass(), "minute", (byte) 55);
        setByteField(term722, term722.getClass(), "second", (byte) 27);
        setIntField(term722, term722.getClass(), "nano", 66889274);
        setField(term717, term717.getClass(), "time", term722);
        setField(term665, term665.getClass(), "lastPlayDate", term717);
        setIntField(term665, term665.getClass(), "courseClass", -894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term665, args);
    }

};


