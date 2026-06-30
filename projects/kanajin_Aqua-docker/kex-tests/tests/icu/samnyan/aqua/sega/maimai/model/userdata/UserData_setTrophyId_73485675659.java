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

public class UserData_setTrophyId_73485675659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15659;
     Object term15833;

    public UserData_setTrophyId_73485675659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15663 = new Long(5953383087795962419L);
        term15659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term15661 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term15677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15659, term15659.getClass(), "id", 5671808784468963649L);
        setLongField(term15661, term15661.getClass(), "id", 2297097306706899827L);
        setField(term15661, term15661.getClass(), "extId", term15663);
        setField(term15661, term15661.getClass(), "luid", "bHHjfDCntT");
        setIntField(term15678, term15678.getClass(), "year", 2026);
        setShortField(term15678, term15678.getClass(), "month", (short) 6);
        setShortField(term15678, term15678.getClass(), "day", (short) 13);
        setField(term15677, term15677.getClass(), "date", term15678);
        setByteField(term15682, term15682.getClass(), "hour", (byte) 19);
        setByteField(term15682, term15682.getClass(), "minute", (byte) 23);
        setByteField(term15682, term15682.getClass(), "second", (byte) 46);
        setIntField(term15682, term15682.getClass(), "nano", 67955056);
        setField(term15677, term15677.getClass(), "time", term15682);
        setField(term15661, term15661.getClass(), "registerTime", term15677);
        setIntField(term15688, term15688.getClass(), "year", 2013);
        setShortField(term15688, term15688.getClass(), "month", (short) 12);
        setShortField(term15688, term15688.getClass(), "day", (short) 23);
        setField(term15687, term15687.getClass(), "date", term15688);
        setByteField(term15692, term15692.getClass(), "hour", (byte) 1);
        setByteField(term15692, term15692.getClass(), "minute", (byte) 0);
        setByteField(term15692, term15692.getClass(), "second", (byte) 32);
        setIntField(term15692, term15692.getClass(), "nano", 168525686);
        setField(term15687, term15687.getClass(), "time", term15692);
        setField(term15661, term15661.getClass(), "accessTime", term15687);
        setField(term15659, term15659.getClass(), "card", term15661);
        setIntField(term15659, term15659.getClass(), "lastDataVersion", -1378803474);
        setField(term15659, term15659.getClass(), "userName", "sEphiduvkv");
        setIntField(term15659, term15659.getClass(), "point", 699225584);
        setIntField(term15659, term15659.getClass(), "totalPoint", -577432675);
        setIntField(term15659, term15659.getClass(), "iconId", -953072528);
        setIntField(term15659, term15659.getClass(), "nameplateId", 2011046892);
        setIntField(term15659, term15659.getClass(), "frameId", 466007219);
        setIntField(term15659, term15659.getClass(), "trophyId", -2142979104);
        setIntField(term15659, term15659.getClass(), "playCount", -1983330479);
        setIntField(term15659, term15659.getClass(), "playVsCount", 1929952462);
        setIntField(term15659, term15659.getClass(), "playSyncCount", 701114540);
        setIntField(term15659, term15659.getClass(), "winCount", -1284079635);
        setIntField(term15659, term15659.getClass(), "helpCount", -2130090775);
        setIntField(term15659, term15659.getClass(), "comboCount", -1455026066);
        setIntField(term15659, term15659.getClass(), "feverCount", -169160528);
        setIntField(term15659, term15659.getClass(), "totalHiScore", 951748736);
        setIntField(term15659, term15659.getClass(), "totalEasyHighScore", 787260842);
        setIntField(term15659, term15659.getClass(), "totalBasicHighScore", -137516512);
        setIntField(term15659, term15659.getClass(), "totalAdvancedHighScore", -585134115);
        setIntField(term15659, term15659.getClass(), "totalExpertHighScore", 1435872700);
        setIntField(term15659, term15659.getClass(), "totalMasterHighScore", 1421496660);
        setIntField(term15659, term15659.getClass(), "totalReMasterHighScore", -1299897376);
        setIntField(term15659, term15659.getClass(), "totalHighSync", 1829266361);
        setIntField(term15659, term15659.getClass(), "totalEasySync", -1296335739);
        setIntField(term15659, term15659.getClass(), "totalBasicSync", -520737857);
        setIntField(term15659, term15659.getClass(), "totalAdvancedSync", -2038325814);
        setIntField(term15659, term15659.getClass(), "totalExpertSync", -581928806);
        setIntField(term15659, term15659.getClass(), "totalMasterSync", -1387086578);
        setIntField(term15659, term15659.getClass(), "totalReMasterSync", -2098841130);
        setIntField(term15659, term15659.getClass(), "playerRating", 65321166);
        setIntField(term15659, term15659.getClass(), "highestRating", -2114805689);
        setIntField(term15659, term15659.getClass(), "rankAuthTailId", 400772784);
        setField(term15659, term15659.getClass(), "eventWatchedDate", "PbLgCSAHce");
        setField(term15659, term15659.getClass(), "webLimitDate", "NWldOLAbqk");
        setIntField(term15659, term15659.getClass(), "challengeTrackPhase", 46781158);
        setIntField(term15659, term15659.getClass(), "firstPlayBits", -1987966813);
        setField(term15659, term15659.getClass(), "lastPlayDate", "qnYaYSpDwO");
        setIntField(term15659, term15659.getClass(), "lastPlaceId", 1778126559);
        setField(term15659, term15659.getClass(), "lastPlaceName", "dgbFDCdHtj");
        setIntField(term15659, term15659.getClass(), "lastRegionId", -1557828355);
        setField(term15659, term15659.getClass(), "lastRegionName", "EKpdCBubDE");
        setField(term15659, term15659.getClass(), "lastClientId", "zMsSLTfGhl");
        setField(term15659, term15659.getClass(), "lastCountryCode", "bEmHScVZaQ");
        setIntField(term15659, term15659.getClass(), "eventPoint", 546963992);
        setIntField(term15659, term15659.getClass(), "totalLv", 1377120507);
        setIntField(term15659, term15659.getClass(), "lastLoginBonusDay", -1581022727);
        setIntField(term15659, term15659.getClass(), "lastSurvivalBonusDay", -371740139);
        setIntField(term15659, term15659.getClass(), "loginBonusLv", -508560324);
        term15833 = new Integer(-1700781575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15833;
        callMethod(klass, "setTrophyId", argTypes, term15659, args);
    }

};


