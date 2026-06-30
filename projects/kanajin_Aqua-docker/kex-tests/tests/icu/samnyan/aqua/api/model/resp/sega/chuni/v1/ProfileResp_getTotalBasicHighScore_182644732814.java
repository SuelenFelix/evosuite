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

public class ProfileResp_getTotalBasicHighScore_182644732814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public ProfileResp_getTotalBasicHighScore_182644732814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1163 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1220 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1163, term1163.getClass(), "userName", "IoAlmYsBwc");
        setIntField(term1163, term1163.getClass(), "level", 2098647989);
        setField(term1163, term1163.getClass(), "exp", "TEParAifyi");
        setLongField(term1163, term1163.getClass(), "point", 1672578078364590450L);
        setLongField(term1163, term1163.getClass(), "totalPoint", 4949335493504695457L);
        setIntField(term1163, term1163.getClass(), "playCount", 1598895173);
        setIntField(term1163, term1163.getClass(), "playerRating", 1830648570);
        setIntField(term1163, term1163.getClass(), "highestRating", -227365013);
        setIntField(term1163, term1163.getClass(), "nameplateId", 11724947);
        setIntField(term1163, term1163.getClass(), "frameId", 1953277050);
        setIntField(term1163, term1163.getClass(), "characterId", 1283079251);
        setIntField(term1163, term1163.getClass(), "trophyId", -523949691);
        setIntField(term1163, term1163.getClass(), "totalMapNum", 1398204340);
        setLongField(term1163, term1163.getClass(), "totalHiScore", -5216789073301458893L);
        setLongField(term1163, term1163.getClass(), "totalBasicHighScore", -1832940336320585644L);
        setLongField(term1163, term1163.getClass(), "totalAdvancedHighScore", -8033714905181142681L);
        setLongField(term1163, term1163.getClass(), "totalExpertHighScore", -9040825890007374809L);
        setLongField(term1163, term1163.getClass(), "totalMasterHighScore", 1368340889161782793L);
        setIntField(term1163, term1163.getClass(), "friendCount", 229204365);
        setIntField(term1206, term1206.getClass(), "year", 2021);
        setShortField(term1206, term1206.getClass(), "month", (short) 8);
        setShortField(term1206, term1206.getClass(), "day", (short) 12);
        setField(term1205, term1205.getClass(), "date", term1206);
        setByteField(term1210, term1210.getClass(), "hour", (byte) 2);
        setByteField(term1210, term1210.getClass(), "minute", (byte) 17);
        setByteField(term1210, term1210.getClass(), "second", (byte) 51);
        setIntField(term1210, term1210.getClass(), "nano", 207375141);
        setField(term1205, term1205.getClass(), "time", term1210);
        setField(term1163, term1163.getClass(), "firstPlayDate", term1205);
        setIntField(term1216, term1216.getClass(), "year", 2025);
        setShortField(term1216, term1216.getClass(), "month", (short) 11);
        setShortField(term1216, term1216.getClass(), "day", (short) 3);
        setField(term1215, term1215.getClass(), "date", term1216);
        setByteField(term1220, term1220.getClass(), "hour", (byte) 21);
        setByteField(term1220, term1220.getClass(), "minute", (byte) 24);
        setByteField(term1220, term1220.getClass(), "second", (byte) 23);
        setIntField(term1220, term1220.getClass(), "nano", 210986721);
        setField(term1215, term1215.getClass(), "time", term1220);
        setField(term1163, term1163.getClass(), "lastPlayDate", term1215);
        setIntField(term1163, term1163.getClass(), "courseClass", -461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term1163, args);
    }

};


