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

public class ProfileResp_getTotalMapNum_13496719312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116763;

    public ProfileResp_getTotalMapNum_13496719312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116763 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116821 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116763, term116763.getClass(), "userName", "TPlnjYoSeR");
        setIntField(term116763, term116763.getClass(), "level", 809427680);
        setField(term116763, term116763.getClass(), "exp", "zVpUpDiXhz");
        setLongField(term116763, term116763.getClass(), "point", 1700931216790135191L);
        setLongField(term116763, term116763.getClass(), "totalPoint", 6748102330891690272L);
        setIntField(term116763, term116763.getClass(), "playCount", -2026834226);
        setIntField(term116763, term116763.getClass(), "playerRating", 1428264736);
        setIntField(term116763, term116763.getClass(), "highestRating", 77063503);
        setIntField(term116763, term116763.getClass(), "nameplateId", 620963897);
        setIntField(term116763, term116763.getClass(), "frameId", -1975484786);
        setIntField(term116763, term116763.getClass(), "characterId", 1949362426);
        setIntField(term116763, term116763.getClass(), "trophyId", 1574052653);
        setIntField(term116763, term116763.getClass(), "totalMapNum", 1236576516);
        setLongField(term116763, term116763.getClass(), "totalHiScore", 8998965991049218409L);
        setLongField(term116763, term116763.getClass(), "totalBasicHighScore", -431742447789353791L);
        setLongField(term116763, term116763.getClass(), "totalAdvancedHighScore", 8416153152120366382L);
        setLongField(term116763, term116763.getClass(), "totalExpertHighScore", -7755069232823867991L);
        setLongField(term116763, term116763.getClass(), "totalMasterHighScore", -1271001176555102057L);
        setLongField(term116763, term116763.getClass(), "totalUltimaHighScore", -1348098694030690325L);
        setIntField(term116763, term116763.getClass(), "friendCount", -1669154209);
        setIntField(term116807, term116807.getClass(), "year", 2029);
        setShortField(term116807, term116807.getClass(), "month", (short) 10);
        setShortField(term116807, term116807.getClass(), "day", (short) 6);
        setField(term116806, term116806.getClass(), "date", term116807);
        setByteField(term116811, term116811.getClass(), "hour", (byte) 16);
        setByteField(term116811, term116811.getClass(), "minute", (byte) 30);
        setByteField(term116811, term116811.getClass(), "second", (byte) 3);
        setIntField(term116811, term116811.getClass(), "nano", 825057981);
        setField(term116806, term116806.getClass(), "time", term116811);
        setField(term116763, term116763.getClass(), "firstPlayDate", term116806);
        setIntField(term116817, term116817.getClass(), "year", 2027);
        setShortField(term116817, term116817.getClass(), "month", (short) 4);
        setShortField(term116817, term116817.getClass(), "day", (short) 9);
        setField(term116816, term116816.getClass(), "date", term116817);
        setByteField(term116821, term116821.getClass(), "hour", (byte) 18);
        setByteField(term116821, term116821.getClass(), "minute", (byte) 10);
        setByteField(term116821, term116821.getClass(), "second", (byte) 36);
        setIntField(term116821, term116821.getClass(), "nano", 747371766);
        setField(term116816, term116816.getClass(), "time", term116821);
        setField(term116763, term116763.getClass(), "lastPlayDate", term116816);
        setIntField(term116763, term116763.getClass(), "courseClass", 1960774168);
        setIntField(term116763, term116763.getClass(), "overPowerPoint", -247430715);
        setIntField(term116763, term116763.getClass(), "overPowerRate", -1629118666);
        setIntField(term116763, term116763.getClass(), "mapIconId", -1248659565);
        setIntField(term116763, term116763.getClass(), "voiceId", -681520438);
        setIntField(term116763, term116763.getClass(), "avatarWear", 771516077);
        setIntField(term116763, term116763.getClass(), "avatarHead", -1338423678);
        setIntField(term116763, term116763.getClass(), "avatarFace", 1121011856);
        setIntField(term116763, term116763.getClass(), "avatarSkin", -2014431620);
        setIntField(term116763, term116763.getClass(), "avatarItem", -1524705461);
        setIntField(term116763, term116763.getClass(), "avatarFront", -1704971541);
        setIntField(term116763, term116763.getClass(), "avatarBack", -1844684333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMapNum", argTypes, term116763, args);
    }

};


