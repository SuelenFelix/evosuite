package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserCharacter_setPoint_14957234829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35283;
     Object term35462;

    public UserCharacter_setPoint_14957234829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35289 = new Long(-4393710401270724527L);
        term35283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term35285 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term35287 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35318 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35283, term35283.getClass(), "id", 1253549421411622358L);
        setLongField(term35285, term35285.getClass(), "id", 3666226122807672448L);
        setLongField(term35287, term35287.getClass(), "id", 3108750145697087661L);
        setField(term35287, term35287.getClass(), "extId", term35289);
        setField(term35287, term35287.getClass(), "luid", "acPRDlpsid");
        setIntField(term35304, term35304.getClass(), "year", 2028);
        setShortField(term35304, term35304.getClass(), "month", (short) 3);
        setShortField(term35304, term35304.getClass(), "day", (short) 20);
        setField(term35303, term35303.getClass(), "date", term35304);
        setByteField(term35308, term35308.getClass(), "hour", (byte) 15);
        setByteField(term35308, term35308.getClass(), "minute", (byte) 5);
        setByteField(term35308, term35308.getClass(), "second", (byte) 16);
        setIntField(term35308, term35308.getClass(), "nano", 223082659);
        setField(term35303, term35303.getClass(), "time", term35308);
        setField(term35287, term35287.getClass(), "registerTime", term35303);
        setIntField(term35314, term35314.getClass(), "year", 2019);
        setShortField(term35314, term35314.getClass(), "month", (short) 4);
        setShortField(term35314, term35314.getClass(), "day", (short) 1);
        setField(term35313, term35313.getClass(), "date", term35314);
        setByteField(term35318, term35318.getClass(), "hour", (byte) 8);
        setByteField(term35318, term35318.getClass(), "minute", (byte) 11);
        setByteField(term35318, term35318.getClass(), "second", (byte) 4);
        setIntField(term35318, term35318.getClass(), "nano", 648208624);
        setField(term35313, term35313.getClass(), "time", term35318);
        setField(term35287, term35287.getClass(), "accessTime", term35313);
        setField(term35285, term35285.getClass(), "card", term35287);
        setIntField(term35285, term35285.getClass(), "lastDataVersion", -1627336108);
        setField(term35285, term35285.getClass(), "userName", "YyojIzvxLZ");
        setIntField(term35285, term35285.getClass(), "point", -70819831);
        setIntField(term35285, term35285.getClass(), "totalPoint", 1601014438);
        setIntField(term35285, term35285.getClass(), "iconId", -1549492777);
        setIntField(term35285, term35285.getClass(), "nameplateId", -1166523434);
        setIntField(term35285, term35285.getClass(), "frameId", -1459222679);
        setIntField(term35285, term35285.getClass(), "trophyId", 91387193);
        setIntField(term35285, term35285.getClass(), "playCount", -457093173);
        setIntField(term35285, term35285.getClass(), "playVsCount", -738503746);
        setIntField(term35285, term35285.getClass(), "playSyncCount", 1118865267);
        setIntField(term35285, term35285.getClass(), "winCount", 1899392740);
        setIntField(term35285, term35285.getClass(), "helpCount", 144291847);
        setIntField(term35285, term35285.getClass(), "comboCount", 263154490);
        setIntField(term35285, term35285.getClass(), "feverCount", 1685033038);
        setIntField(term35285, term35285.getClass(), "totalHiScore", 1455872685);
        setIntField(term35285, term35285.getClass(), "totalEasyHighScore", -895803070);
        setIntField(term35285, term35285.getClass(), "totalBasicHighScore", -2065313027);
        setIntField(term35285, term35285.getClass(), "totalAdvancedHighScore", 394881188);
        setIntField(term35285, term35285.getClass(), "totalExpertHighScore", 2114133243);
        setIntField(term35285, term35285.getClass(), "totalMasterHighScore", -1108430202);
        setIntField(term35285, term35285.getClass(), "totalReMasterHighScore", 972569482);
        setIntField(term35285, term35285.getClass(), "totalHighSync", -924513639);
        setIntField(term35285, term35285.getClass(), "totalEasySync", -1763498118);
        setIntField(term35285, term35285.getClass(), "totalBasicSync", -1084106934);
        setIntField(term35285, term35285.getClass(), "totalAdvancedSync", -1137769039);
        setIntField(term35285, term35285.getClass(), "totalExpertSync", 753769464);
        setIntField(term35285, term35285.getClass(), "totalMasterSync", -2025824446);
        setIntField(term35285, term35285.getClass(), "totalReMasterSync", -203123521);
        setIntField(term35285, term35285.getClass(), "playerRating", 2107969370);
        setIntField(term35285, term35285.getClass(), "highestRating", -1606896209);
        setIntField(term35285, term35285.getClass(), "rankAuthTailId", 1824801079);
        setField(term35285, term35285.getClass(), "eventWatchedDate", "fxapaYlZea");
        setField(term35285, term35285.getClass(), "webLimitDate", "VJgREHwfRM");
        setIntField(term35285, term35285.getClass(), "challengeTrackPhase", 1191665770);
        setIntField(term35285, term35285.getClass(), "firstPlayBits", -401274751);
        setField(term35285, term35285.getClass(), "lastPlayDate", "kXnpLIZTAr");
        setIntField(term35285, term35285.getClass(), "lastPlaceId", 2063937149);
        setField(term35285, term35285.getClass(), "lastPlaceName", "ZiMAmqpbzk");
        setIntField(term35285, term35285.getClass(), "lastRegionId", 166881458);
        setField(term35285, term35285.getClass(), "lastRegionName", "UwJtBPAtSU");
        setField(term35285, term35285.getClass(), "lastClientId", "nBaMiSdFmS");
        setField(term35285, term35285.getClass(), "lastCountryCode", "ezwGsjqTai");
        setIntField(term35285, term35285.getClass(), "eventPoint", 828853234);
        setIntField(term35285, term35285.getClass(), "totalLv", 1203278976);
        setIntField(term35285, term35285.getClass(), "lastLoginBonusDay", 751787241);
        setIntField(term35285, term35285.getClass(), "lastSurvivalBonusDay", 477748320);
        setIntField(term35285, term35285.getClass(), "loginBonusLv", 512793147);
        setField(term35283, term35283.getClass(), "user", term35285);
        setIntField(term35283, term35283.getClass(), "characterId", -2061386860);
        setIntField(term35283, term35283.getClass(), "point", -678230923);
        setIntField(term35283, term35283.getClass(), "level", 2001978730);
        term35462 = new Integer(835522995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35462;
        callMethod(klass, "setPoint", argTypes, term35283, args);
    }

};


