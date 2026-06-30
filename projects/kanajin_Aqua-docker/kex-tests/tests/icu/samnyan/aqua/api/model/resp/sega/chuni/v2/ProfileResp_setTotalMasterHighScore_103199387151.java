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

public class ProfileResp_setTotalMasterHighScore_103199387151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120542;
     Object term120617;

    public ProfileResp_setTotalMasterHighScore_103199387151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120542 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120590 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120600 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120542, term120542.getClass(), "userName", "vkVKjCrolQ");
        setIntField(term120542, term120542.getClass(), "level", -1100008713);
        setField(term120542, term120542.getClass(), "exp", "BrcErlTKix");
        setLongField(term120542, term120542.getClass(), "point", 6420416810130314697L);
        setLongField(term120542, term120542.getClass(), "totalPoint", -1949964620904962419L);
        setIntField(term120542, term120542.getClass(), "playCount", 1097639705);
        setIntField(term120542, term120542.getClass(), "playerRating", -1633931594);
        setIntField(term120542, term120542.getClass(), "highestRating", 1263772942);
        setIntField(term120542, term120542.getClass(), "nameplateId", -1162421147);
        setIntField(term120542, term120542.getClass(), "frameId", 1801498625);
        setIntField(term120542, term120542.getClass(), "characterId", 2098424189);
        setIntField(term120542, term120542.getClass(), "trophyId", 2125987813);
        setIntField(term120542, term120542.getClass(), "totalMapNum", -974020680);
        setLongField(term120542, term120542.getClass(), "totalHiScore", -8551703328287150294L);
        setLongField(term120542, term120542.getClass(), "totalBasicHighScore", -7184114446608947533L);
        setLongField(term120542, term120542.getClass(), "totalAdvancedHighScore", 4282611577386894476L);
        setLongField(term120542, term120542.getClass(), "totalExpertHighScore", 5461840589943005596L);
        setLongField(term120542, term120542.getClass(), "totalMasterHighScore", 4172079491130812074L);
        setLongField(term120542, term120542.getClass(), "totalUltimaHighScore", -3422932225408332326L);
        setIntField(term120542, term120542.getClass(), "friendCount", 540917256);
        setIntField(term120586, term120586.getClass(), "year", 2016);
        setShortField(term120586, term120586.getClass(), "month", (short) 5);
        setShortField(term120586, term120586.getClass(), "day", (short) 13);
        setField(term120585, term120585.getClass(), "date", term120586);
        setByteField(term120590, term120590.getClass(), "hour", (byte) 5);
        setByteField(term120590, term120590.getClass(), "minute", (byte) 58);
        setByteField(term120590, term120590.getClass(), "second", (byte) 39);
        setIntField(term120590, term120590.getClass(), "nano", 24383166);
        setField(term120585, term120585.getClass(), "time", term120590);
        setField(term120542, term120542.getClass(), "firstPlayDate", term120585);
        setIntField(term120596, term120596.getClass(), "year", 2012);
        setShortField(term120596, term120596.getClass(), "month", (short) 12);
        setShortField(term120596, term120596.getClass(), "day", (short) 7);
        setField(term120595, term120595.getClass(), "date", term120596);
        setByteField(term120600, term120600.getClass(), "hour", (byte) 15);
        setByteField(term120600, term120600.getClass(), "minute", (byte) 54);
        setByteField(term120600, term120600.getClass(), "second", (byte) 5);
        setIntField(term120600, term120600.getClass(), "nano", 919760350);
        setField(term120595, term120595.getClass(), "time", term120600);
        setField(term120542, term120542.getClass(), "lastPlayDate", term120595);
        setIntField(term120542, term120542.getClass(), "courseClass", 170691120);
        setIntField(term120542, term120542.getClass(), "overPowerPoint", 2001544057);
        setIntField(term120542, term120542.getClass(), "overPowerRate", -1766584867);
        setIntField(term120542, term120542.getClass(), "mapIconId", -1957706625);
        setIntField(term120542, term120542.getClass(), "voiceId", -1933720195);
        setIntField(term120542, term120542.getClass(), "avatarWear", 669679366);
        setIntField(term120542, term120542.getClass(), "avatarHead", -1625164049);
        setIntField(term120542, term120542.getClass(), "avatarFace", 13052647);
        setIntField(term120542, term120542.getClass(), "avatarSkin", 137234566);
        setIntField(term120542, term120542.getClass(), "avatarItem", 1763513976);
        setIntField(term120542, term120542.getClass(), "avatarFront", 168265436);
        setIntField(term120542, term120542.getClass(), "avatarBack", -262842681);
        term120617 = new Long(-7436930987563830432L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term120617;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term120542, args);
    }

};


