package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setLastRegionName_45140817295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38460;

    public ExternalUserData_setLastRegionName_45140817295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38460 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term38485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38551 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38599 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38645 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38460, term38460.getClass(), "accessCode", "JwQlbBbGJR");
        setField(term38460, term38460.getClass(), "userName", "HdWLwfVsAM");
        setIntField(term38486, term38486.getClass(), "year", 2017);
        setShortField(term38486, term38486.getClass(), "month", (short) 2);
        setShortField(term38486, term38486.getClass(), "day", (short) 28);
        setField(term38485, term38485.getClass(), "date", term38486);
        setByteField(term38490, term38490.getClass(), "hour", (byte) 16);
        setByteField(term38490, term38490.getClass(), "minute", (byte) 54);
        setByteField(term38490, term38490.getClass(), "second", (byte) 4);
        setIntField(term38490, term38490.getClass(), "nano", 721722853);
        setField(term38485, term38485.getClass(), "time", term38490);
        setField(term38460, term38460.getClass(), "lastLoginDate", term38485);
        setBooleanField(term38460, term38460.getClass(), "isWebJoin", false);
        setField(term38460, term38460.getClass(), "webLimitDate", "SxeKEdHXSl");
        setIntField(term38460, term38460.getClass(), "level", 1904559758);
        setIntField(term38460, term38460.getClass(), "reincarnationNum", 610850630);
        setField(term38460, term38460.getClass(), "exp", "BCAlJpNjIX");
        setLongField(term38460, term38460.getClass(), "point", -5608790408657117046L);
        setLongField(term38460, term38460.getClass(), "totalPoint", -6265886087280835813L);
        setIntField(term38460, term38460.getClass(), "playCount", 170509161);
        setIntField(term38460, term38460.getClass(), "multiPlayCount", 491497994);
        setIntField(term38460, term38460.getClass(), "multiWinCount", 1997288643);
        setIntField(term38460, term38460.getClass(), "requestResCount", -378961519);
        setIntField(term38460, term38460.getClass(), "acceptResCount", -400280008);
        setIntField(term38460, term38460.getClass(), "successResCount", -1191957775);
        setIntField(term38460, term38460.getClass(), "playerRating", 14181775);
        setIntField(term38460, term38460.getClass(), "highestRating", 667778327);
        setIntField(term38460, term38460.getClass(), "nameplateId", 395074450);
        setIntField(term38460, term38460.getClass(), "frameId", -2028511200);
        setIntField(term38460, term38460.getClass(), "characterId", 1415605360);
        setIntField(term38460, term38460.getClass(), "trophyId", 896275171);
        setIntField(term38460, term38460.getClass(), "playedTutorialBit", 466010);
        setIntField(term38460, term38460.getClass(), "firstTutorialCancelNum", -169463842);
        setIntField(term38460, term38460.getClass(), "masterTutorialCancelNum", -2106837394);
        setIntField(term38460, term38460.getClass(), "totalRepertoireCount", -533202192);
        setIntField(term38460, term38460.getClass(), "totalMapNum", -1349617857);
        setLongField(term38460, term38460.getClass(), "totalHiScore", 8408467837292297525L);
        setLongField(term38460, term38460.getClass(), "totalBasicHighScore", -5157976075409724332L);
        setLongField(term38460, term38460.getClass(), "totalAdvancedHighScore", 5638814204437933939L);
        setLongField(term38460, term38460.getClass(), "totalExpertHighScore", -5717327658642389548L);
        setLongField(term38460, term38460.getClass(), "totalMasterHighScore", 8495724482241106293L);
        setIntField(term38547, term38547.getClass(), "year", 2018);
        setShortField(term38547, term38547.getClass(), "month", (short) 8);
        setShortField(term38547, term38547.getClass(), "day", (short) 4);
        setField(term38546, term38546.getClass(), "date", term38547);
        setByteField(term38551, term38551.getClass(), "hour", (byte) 8);
        setByteField(term38551, term38551.getClass(), "minute", (byte) 15);
        setByteField(term38551, term38551.getClass(), "second", (byte) 15);
        setIntField(term38551, term38551.getClass(), "nano", 116834692);
        setField(term38546, term38546.getClass(), "time", term38551);
        setField(term38460, term38460.getClass(), "eventWatchedDate", term38546);
        setIntField(term38460, term38460.getClass(), "friendCount", 1346331516);
        setBooleanField(term38460, term38460.getClass(), "isMaimai", true);
        setField(term38460, term38460.getClass(), "firstGameId", "PKClfBAwUr");
        setField(term38460, term38460.getClass(), "firstRomVersion", "JqbKrmVEMy");
        setField(term38460, term38460.getClass(), "firstDataVersion", "VygCEWaefB");
        setIntField(term38595, term38595.getClass(), "year", 2025);
        setShortField(term38595, term38595.getClass(), "month", (short) 8);
        setShortField(term38595, term38595.getClass(), "day", (short) 18);
        setField(term38594, term38594.getClass(), "date", term38595);
        setByteField(term38599, term38599.getClass(), "hour", (byte) 11);
        setByteField(term38599, term38599.getClass(), "minute", (byte) 28);
        setByteField(term38599, term38599.getClass(), "second", (byte) 28);
        setIntField(term38599, term38599.getClass(), "nano", 32159081);
        setField(term38594, term38594.getClass(), "time", term38599);
        setField(term38460, term38460.getClass(), "firstPlayDate", term38594);
        setField(term38460, term38460.getClass(), "lastGameId", "PqhYfEyDDA");
        setField(term38460, term38460.getClass(), "lastRomVersion", "fSLHLeuNoa");
        setField(term38460, term38460.getClass(), "lastDataVersion", "IwgPFurObw");
        setIntField(term38641, term38641.getClass(), "year", 2026);
        setShortField(term38641, term38641.getClass(), "month", (short) 5);
        setShortField(term38641, term38641.getClass(), "day", (short) 14);
        setField(term38640, term38640.getClass(), "date", term38641);
        setByteField(term38645, term38645.getClass(), "hour", (byte) 3);
        setByteField(term38645, term38645.getClass(), "minute", (byte) 43);
        setByteField(term38645, term38645.getClass(), "second", (byte) 41);
        setIntField(term38645, term38645.getClass(), "nano", 519970122);
        setField(term38640, term38640.getClass(), "time", term38645);
        setField(term38460, term38460.getClass(), "lastPlayDate", term38640);
        setIntField(term38460, term38460.getClass(), "lastPlaceId", 1018925421);
        setField(term38460, term38460.getClass(), "lastPlaceName", "WLaHlrYQyz");
        setField(term38460, term38460.getClass(), "lastRegionId", "CaeIUTuUFo");
        setField(term38460, term38460.getClass(), "lastRegionName", "rzoDGjHkzG");
        setField(term38460, term38460.getClass(), "lastAllNetId", "NsphHxYiuC");
        setField(term38460, term38460.getClass(), "lastClientId", "XYJztkznbY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NeTiWVoyjZ";
        callMethod(klass, "setLastRegionName", argTypes, term38460, args);
    }

};


