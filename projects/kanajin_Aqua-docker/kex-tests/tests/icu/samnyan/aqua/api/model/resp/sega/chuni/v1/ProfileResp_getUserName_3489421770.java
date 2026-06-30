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

public class ProfileResp_getUserName_3489421770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProfileResp_getUserName_3489421770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term43 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "userName", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "level", 568599855);
        setField(term1, term1.getClass(), "exp", "sjlJAEtRrb");
        setLongField(term1, term1.getClass(), "point", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "totalPoint", 6375119433582206027L);
        setIntField(term1, term1.getClass(), "playCount", 1162663216);
        setIntField(term1, term1.getClass(), "playerRating", 1484323161);
        setIntField(term1, term1.getClass(), "highestRating", 391863371);
        setIntField(term1, term1.getClass(), "nameplateId", -1922583790);
        setIntField(term1, term1.getClass(), "frameId", -616727354);
        setIntField(term1, term1.getClass(), "characterId", -1955890973);
        setIntField(term1, term1.getClass(), "trophyId", -2038273078);
        setIntField(term1, term1.getClass(), "totalMapNum", 1227103734);
        setLongField(term1, term1.getClass(), "totalHiScore", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "totalBasicHighScore", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "totalAdvancedHighScore", 5270370404989704783L);
        setLongField(term1, term1.getClass(), "totalExpertHighScore", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "totalMasterHighScore", 4872422362414183754L);
        setIntField(term1, term1.getClass(), "friendCount", -1339778481);
        setIntField(term44, term44.getClass(), "year", 2012);
        setShortField(term44, term44.getClass(), "month", (short) 8);
        setShortField(term44, term44.getClass(), "day", (short) 25);
        setField(term43, term43.getClass(), "date", term44);
        setByteField(term48, term48.getClass(), "hour", (byte) 5);
        setByteField(term48, term48.getClass(), "minute", (byte) 20);
        setByteField(term48, term48.getClass(), "second", (byte) 50);
        setIntField(term48, term48.getClass(), "nano", 345595912);
        setField(term43, term43.getClass(), "time", term48);
        setField(term1, term1.getClass(), "firstPlayDate", term43);
        setIntField(term54, term54.getClass(), "year", 2021);
        setShortField(term54, term54.getClass(), "month", (short) 1);
        setShortField(term54, term54.getClass(), "day", (short) 18);
        setField(term53, term53.getClass(), "date", term54);
        setByteField(term58, term58.getClass(), "hour", (byte) 13);
        setByteField(term58, term58.getClass(), "minute", (byte) 38);
        setByteField(term58, term58.getClass(), "second", (byte) 26);
        setIntField(term58, term58.getClass(), "nano", 544608644);
        setField(term53, term53.getClass(), "time", term58);
        setField(term1, term1.getClass(), "lastPlayDate", term53);
        setIntField(term1, term1.getClass(), "courseClass", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term1, args);
    }

};


