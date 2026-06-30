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

public class UserItem_setItemId_7134905869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86979;
     Object term87158;

    public UserItem_setItemId_7134905869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86985 = new Long(174253963298276221L);
        term86979 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term86981 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term86983 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87014 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term86979, term86979.getClass(), "id", -8123300791906968552L);
        setLongField(term86981, term86981.getClass(), "id", 7654605795400256601L);
        setLongField(term86983, term86983.getClass(), "id", 3610800451815944213L);
        setField(term86983, term86983.getClass(), "extId", term86985);
        setField(term86983, term86983.getClass(), "luid", "DCRuiaVwNa");
        setIntField(term87000, term87000.getClass(), "year", 2013);
        setShortField(term87000, term87000.getClass(), "month", (short) 5);
        setShortField(term87000, term87000.getClass(), "day", (short) 5);
        setField(term86999, term86999.getClass(), "date", term87000);
        setByteField(term87004, term87004.getClass(), "hour", (byte) 7);
        setByteField(term87004, term87004.getClass(), "minute", (byte) 44);
        setByteField(term87004, term87004.getClass(), "second", (byte) 24);
        setIntField(term87004, term87004.getClass(), "nano", 458681760);
        setField(term86999, term86999.getClass(), "time", term87004);
        setField(term86983, term86983.getClass(), "registerTime", term86999);
        setIntField(term87010, term87010.getClass(), "year", 2019);
        setShortField(term87010, term87010.getClass(), "month", (short) 1);
        setShortField(term87010, term87010.getClass(), "day", (short) 12);
        setField(term87009, term87009.getClass(), "date", term87010);
        setByteField(term87014, term87014.getClass(), "hour", (byte) 5);
        setByteField(term87014, term87014.getClass(), "minute", (byte) 47);
        setByteField(term87014, term87014.getClass(), "second", (byte) 36);
        setIntField(term87014, term87014.getClass(), "nano", 50353124);
        setField(term87009, term87009.getClass(), "time", term87014);
        setField(term86983, term86983.getClass(), "accessTime", term87009);
        setField(term86981, term86981.getClass(), "card", term86983);
        setIntField(term86981, term86981.getClass(), "lastDataVersion", 1912715011);
        setField(term86981, term86981.getClass(), "userName", "VTjvZBqRUX");
        setIntField(term86981, term86981.getClass(), "point", -1793275062);
        setIntField(term86981, term86981.getClass(), "totalPoint", 311045652);
        setIntField(term86981, term86981.getClass(), "iconId", -404238276);
        setIntField(term86981, term86981.getClass(), "nameplateId", 453390849);
        setIntField(term86981, term86981.getClass(), "frameId", 792369197);
        setIntField(term86981, term86981.getClass(), "trophyId", 550257073);
        setIntField(term86981, term86981.getClass(), "playCount", 72941694);
        setIntField(term86981, term86981.getClass(), "playVsCount", 1084937078);
        setIntField(term86981, term86981.getClass(), "playSyncCount", 1895908546);
        setIntField(term86981, term86981.getClass(), "winCount", -1334535627);
        setIntField(term86981, term86981.getClass(), "helpCount", -1899505891);
        setIntField(term86981, term86981.getClass(), "comboCount", -1703391320);
        setIntField(term86981, term86981.getClass(), "feverCount", -1849520734);
        setIntField(term86981, term86981.getClass(), "totalHiScore", -1641716943);
        setIntField(term86981, term86981.getClass(), "totalEasyHighScore", -118475757);
        setIntField(term86981, term86981.getClass(), "totalBasicHighScore", -664289577);
        setIntField(term86981, term86981.getClass(), "totalAdvancedHighScore", -122644875);
        setIntField(term86981, term86981.getClass(), "totalExpertHighScore", -2091282338);
        setIntField(term86981, term86981.getClass(), "totalMasterHighScore", 295092300);
        setIntField(term86981, term86981.getClass(), "totalReMasterHighScore", 566606497);
        setIntField(term86981, term86981.getClass(), "totalHighSync", 539575684);
        setIntField(term86981, term86981.getClass(), "totalEasySync", -164506727);
        setIntField(term86981, term86981.getClass(), "totalBasicSync", -1752873646);
        setIntField(term86981, term86981.getClass(), "totalAdvancedSync", 1398762920);
        setIntField(term86981, term86981.getClass(), "totalExpertSync", 774063243);
        setIntField(term86981, term86981.getClass(), "totalMasterSync", -99848402);
        setIntField(term86981, term86981.getClass(), "totalReMasterSync", 1606962249);
        setIntField(term86981, term86981.getClass(), "playerRating", -981567119);
        setIntField(term86981, term86981.getClass(), "highestRating", 925481683);
        setIntField(term86981, term86981.getClass(), "rankAuthTailId", -1873713064);
        setField(term86981, term86981.getClass(), "eventWatchedDate", "vhjxsMJjOh");
        setField(term86981, term86981.getClass(), "webLimitDate", "gKgsqLPDCs");
        setIntField(term86981, term86981.getClass(), "challengeTrackPhase", 2075342882);
        setIntField(term86981, term86981.getClass(), "firstPlayBits", 1797445263);
        setField(term86981, term86981.getClass(), "lastPlayDate", "crZAQIKgDI");
        setIntField(term86981, term86981.getClass(), "lastPlaceId", 1653675136);
        setField(term86981, term86981.getClass(), "lastPlaceName", "uDAdogNiBQ");
        setIntField(term86981, term86981.getClass(), "lastRegionId", 661708296);
        setField(term86981, term86981.getClass(), "lastRegionName", "GnPrxkKUmR");
        setField(term86981, term86981.getClass(), "lastClientId", "gVgLmqgxMh");
        setField(term86981, term86981.getClass(), "lastCountryCode", "QWknVCpJTU");
        setIntField(term86981, term86981.getClass(), "eventPoint", -238072053);
        setIntField(term86981, term86981.getClass(), "totalLv", -1590160640);
        setIntField(term86981, term86981.getClass(), "lastLoginBonusDay", 912288551);
        setIntField(term86981, term86981.getClass(), "lastSurvivalBonusDay", 1638500325);
        setIntField(term86981, term86981.getClass(), "loginBonusLv", 1177380645);
        setField(term86979, term86979.getClass(), "user", term86981);
        setIntField(term86979, term86979.getClass(), "itemKind", -394947882);
        setIntField(term86979, term86979.getClass(), "itemId", 84960163);
        setIntField(term86979, term86979.getClass(), "stock", -1576427116);
        term87158 = new Integer(836315769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87158;
        callMethod(klass, "setItemId", argTypes, term86979, args);
    }

};


