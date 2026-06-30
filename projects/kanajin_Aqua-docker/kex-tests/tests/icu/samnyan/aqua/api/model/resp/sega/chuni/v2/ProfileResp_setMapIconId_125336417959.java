package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setMapIconId_125336417959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121334;
     Object term121409;

    public ProfileResp_setMapIconId_125336417959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121334 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121392 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121334, term121334.getClass(), "userName", "TXxuyKOVBs");
        setIntField(term121334, term121334.getClass(), "level", -360656932);
        setField(term121334, term121334.getClass(), "exp", "ZdokwWCVab");
        setLongField(term121334, term121334.getClass(), "point", 8591732307930288390L);
        setLongField(term121334, term121334.getClass(), "totalPoint", 9166529803454779143L);
        setIntField(term121334, term121334.getClass(), "playCount", 338220550);
        setIntField(term121334, term121334.getClass(), "playerRating", -2059073891);
        setIntField(term121334, term121334.getClass(), "highestRating", -71809626);
        setIntField(term121334, term121334.getClass(), "nameplateId", 1262110939);
        setIntField(term121334, term121334.getClass(), "frameId", -363465680);
        setIntField(term121334, term121334.getClass(), "characterId", -1901100209);
        setIntField(term121334, term121334.getClass(), "trophyId", 248709706);
        setIntField(term121334, term121334.getClass(), "totalMapNum", 444629889);
        setLongField(term121334, term121334.getClass(), "totalHiScore", 8866183747501835163L);
        setLongField(term121334, term121334.getClass(), "totalBasicHighScore", 1356686635320246830L);
        setLongField(term121334, term121334.getClass(), "totalAdvancedHighScore", 220986449734641173L);
        setLongField(term121334, term121334.getClass(), "totalExpertHighScore", 5817982950792619847L);
        setLongField(term121334, term121334.getClass(), "totalMasterHighScore", 8035056509253472342L);
        setLongField(term121334, term121334.getClass(), "totalUltimaHighScore", -7845710797851074028L);
        setIntField(term121334, term121334.getClass(), "friendCount", -872087578);
        setIntField(term121378, term121378.getClass(), "year", 2022);
        setShortField(term121378, term121378.getClass(), "month", (short) 6);
        setShortField(term121378, term121378.getClass(), "day", (short) 20);
        setField(term121377, term121377.getClass(), "date", term121378);
        setByteField(term121382, term121382.getClass(), "hour", (byte) 12);
        setByteField(term121382, term121382.getClass(), "minute", (byte) 43);
        setByteField(term121382, term121382.getClass(), "second", (byte) 51);
        setIntField(term121382, term121382.getClass(), "nano", 526692254);
        setField(term121377, term121377.getClass(), "time", term121382);
        setField(term121334, term121334.getClass(), "firstPlayDate", term121377);
        setIntField(term121388, term121388.getClass(), "year", 2021);
        setShortField(term121388, term121388.getClass(), "month", (short) 3);
        setShortField(term121388, term121388.getClass(), "day", (short) 5);
        setField(term121387, term121387.getClass(), "date", term121388);
        setByteField(term121392, term121392.getClass(), "hour", (byte) 23);
        setByteField(term121392, term121392.getClass(), "minute", (byte) 20);
        setByteField(term121392, term121392.getClass(), "second", (byte) 25);
        setIntField(term121392, term121392.getClass(), "nano", 514717991);
        setField(term121387, term121387.getClass(), "time", term121392);
        setField(term121334, term121334.getClass(), "lastPlayDate", term121387);
        setIntField(term121334, term121334.getClass(), "courseClass", -479276769);
        setIntField(term121334, term121334.getClass(), "overPowerPoint", 1733531324);
        setIntField(term121334, term121334.getClass(), "overPowerRate", 265046422);
        setIntField(term121334, term121334.getClass(), "mapIconId", 1585991799);
        setIntField(term121334, term121334.getClass(), "voiceId", 614789717);
        setIntField(term121334, term121334.getClass(), "avatarWear", -240092976);
        setIntField(term121334, term121334.getClass(), "avatarHead", -543633311);
        setIntField(term121334, term121334.getClass(), "avatarFace", 2103707947);
        setIntField(term121334, term121334.getClass(), "avatarSkin", -1216538589);
        setIntField(term121334, term121334.getClass(), "avatarItem", -1279501709);
        setIntField(term121334, term121334.getClass(), "avatarFront", -1215117678);
        setIntField(term121334, term121334.getClass(), "avatarBack", -419308721);
        term121409 = new Integer(277036333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121409;
        callMethod(klass, "setMapIconId", argTypes, term121334, args);
    }

};


