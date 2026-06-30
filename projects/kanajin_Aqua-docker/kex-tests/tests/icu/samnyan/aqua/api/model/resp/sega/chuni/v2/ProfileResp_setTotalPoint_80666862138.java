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
import java.lang.Long;

public class ProfileResp_setTotalPoint_80666862138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119281;
     Object term119356;

    public ProfileResp_setTotalPoint_80666862138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119281 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119329 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119339 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119281, term119281.getClass(), "userName", "WOBYQpSKJt");
        setIntField(term119281, term119281.getClass(), "level", 240930022);
        setField(term119281, term119281.getClass(), "exp", "JvStduaHMS");
        setLongField(term119281, term119281.getClass(), "point", -6827271135302328977L);
        setLongField(term119281, term119281.getClass(), "totalPoint", -497952545782064277L);
        setIntField(term119281, term119281.getClass(), "playCount", 362203829);
        setIntField(term119281, term119281.getClass(), "playerRating", 301779231);
        setIntField(term119281, term119281.getClass(), "highestRating", -428827809);
        setIntField(term119281, term119281.getClass(), "nameplateId", 2007175527);
        setIntField(term119281, term119281.getClass(), "frameId", 1414770763);
        setIntField(term119281, term119281.getClass(), "characterId", 1277812255);
        setIntField(term119281, term119281.getClass(), "trophyId", 63199285);
        setIntField(term119281, term119281.getClass(), "totalMapNum", 528777979);
        setLongField(term119281, term119281.getClass(), "totalHiScore", 7460739162162045801L);
        setLongField(term119281, term119281.getClass(), "totalBasicHighScore", -5532808814285818165L);
        setLongField(term119281, term119281.getClass(), "totalAdvancedHighScore", 8715063241676350223L);
        setLongField(term119281, term119281.getClass(), "totalExpertHighScore", 8749998032565339478L);
        setLongField(term119281, term119281.getClass(), "totalMasterHighScore", -2844921168908116451L);
        setLongField(term119281, term119281.getClass(), "totalUltimaHighScore", 1210014003210444730L);
        setIntField(term119281, term119281.getClass(), "friendCount", 519399891);
        setIntField(term119325, term119325.getClass(), "year", 2028);
        setShortField(term119325, term119325.getClass(), "month", (short) 10);
        setShortField(term119325, term119325.getClass(), "day", (short) 27);
        setField(term119324, term119324.getClass(), "date", term119325);
        setByteField(term119329, term119329.getClass(), "hour", (byte) 0);
        setByteField(term119329, term119329.getClass(), "minute", (byte) 34);
        setByteField(term119329, term119329.getClass(), "second", (byte) 34);
        setIntField(term119329, term119329.getClass(), "nano", 459766896);
        setField(term119324, term119324.getClass(), "time", term119329);
        setField(term119281, term119281.getClass(), "firstPlayDate", term119324);
        setIntField(term119335, term119335.getClass(), "year", 2018);
        setShortField(term119335, term119335.getClass(), "month", (short) 5);
        setShortField(term119335, term119335.getClass(), "day", (short) 17);
        setField(term119334, term119334.getClass(), "date", term119335);
        setByteField(term119339, term119339.getClass(), "hour", (byte) 2);
        setByteField(term119339, term119339.getClass(), "minute", (byte) 49);
        setByteField(term119339, term119339.getClass(), "second", (byte) 14);
        setIntField(term119339, term119339.getClass(), "nano", 631936405);
        setField(term119334, term119334.getClass(), "time", term119339);
        setField(term119281, term119281.getClass(), "lastPlayDate", term119334);
        setIntField(term119281, term119281.getClass(), "courseClass", 1010357225);
        setIntField(term119281, term119281.getClass(), "overPowerPoint", -18171265);
        setIntField(term119281, term119281.getClass(), "overPowerRate", 220916394);
        setIntField(term119281, term119281.getClass(), "mapIconId", -1242924635);
        setIntField(term119281, term119281.getClass(), "voiceId", 254104144);
        setIntField(term119281, term119281.getClass(), "avatarWear", 1712984837);
        setIntField(term119281, term119281.getClass(), "avatarHead", -687749625);
        setIntField(term119281, term119281.getClass(), "avatarFace", -1172742911);
        setIntField(term119281, term119281.getClass(), "avatarSkin", 1657746124);
        setIntField(term119281, term119281.getClass(), "avatarItem", -1983656562);
        setIntField(term119281, term119281.getClass(), "avatarFront", -1613391875);
        setIntField(term119281, term119281.getClass(), "avatarBack", -173242489);
        term119356 = new Long(4954389181137471134L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term119356;
        callMethod(klass, "setTotalPoint", argTypes, term119281, args);
    }

};


