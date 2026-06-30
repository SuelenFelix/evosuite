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

public class UserData_getFirstPlayBits_121365468537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9769;

    public UserData_getFirstPlayBits_121365468537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9773 = new Long(1439298019805881866L);
        term9769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term9771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9802 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9769, term9769.getClass(), "id", 682356318767179819L);
        setLongField(term9771, term9771.getClass(), "id", -7291743527973326814L);
        setField(term9771, term9771.getClass(), "extId", term9773);
        setField(term9771, term9771.getClass(), "luid", "lZIgPZPgTu");
        setIntField(term9788, term9788.getClass(), "year", 2010);
        setShortField(term9788, term9788.getClass(), "month", (short) 2);
        setShortField(term9788, term9788.getClass(), "day", (short) 24);
        setField(term9787, term9787.getClass(), "date", term9788);
        setByteField(term9792, term9792.getClass(), "hour", (byte) 17);
        setByteField(term9792, term9792.getClass(), "minute", (byte) 58);
        setByteField(term9792, term9792.getClass(), "second", (byte) 56);
        setIntField(term9792, term9792.getClass(), "nano", 291725532);
        setField(term9787, term9787.getClass(), "time", term9792);
        setField(term9771, term9771.getClass(), "registerTime", term9787);
        setIntField(term9798, term9798.getClass(), "year", 2028);
        setShortField(term9798, term9798.getClass(), "month", (short) 7);
        setShortField(term9798, term9798.getClass(), "day", (short) 22);
        setField(term9797, term9797.getClass(), "date", term9798);
        setByteField(term9802, term9802.getClass(), "hour", (byte) 18);
        setByteField(term9802, term9802.getClass(), "minute", (byte) 33);
        setByteField(term9802, term9802.getClass(), "second", (byte) 7);
        setIntField(term9802, term9802.getClass(), "nano", 763613074);
        setField(term9797, term9797.getClass(), "time", term9802);
        setField(term9771, term9771.getClass(), "accessTime", term9797);
        setField(term9769, term9769.getClass(), "card", term9771);
        setIntField(term9769, term9769.getClass(), "lastDataVersion", -1095121979);
        setField(term9769, term9769.getClass(), "userName", "iuCxnHGMoW");
        setIntField(term9769, term9769.getClass(), "point", -1674851914);
        setIntField(term9769, term9769.getClass(), "totalPoint", -1891353352);
        setIntField(term9769, term9769.getClass(), "iconId", 113007640);
        setIntField(term9769, term9769.getClass(), "nameplateId", 1782226794);
        setIntField(term9769, term9769.getClass(), "frameId", 1115327577);
        setIntField(term9769, term9769.getClass(), "trophyId", 840704993);
        setIntField(term9769, term9769.getClass(), "playCount", 1297035285);
        setIntField(term9769, term9769.getClass(), "playVsCount", -826239685);
        setIntField(term9769, term9769.getClass(), "playSyncCount", -845551243);
        setIntField(term9769, term9769.getClass(), "winCount", 370671198);
        setIntField(term9769, term9769.getClass(), "helpCount", 1426800646);
        setIntField(term9769, term9769.getClass(), "comboCount", 954234820);
        setIntField(term9769, term9769.getClass(), "feverCount", 1047346538);
        setIntField(term9769, term9769.getClass(), "totalHiScore", 728436340);
        setIntField(term9769, term9769.getClass(), "totalEasyHighScore", 1841731593);
        setIntField(term9769, term9769.getClass(), "totalBasicHighScore", -1854929057);
        setIntField(term9769, term9769.getClass(), "totalAdvancedHighScore", 1703814701);
        setIntField(term9769, term9769.getClass(), "totalExpertHighScore", 1370246522);
        setIntField(term9769, term9769.getClass(), "totalMasterHighScore", -574611924);
        setIntField(term9769, term9769.getClass(), "totalReMasterHighScore", 512521742);
        setIntField(term9769, term9769.getClass(), "totalHighSync", 1291000976);
        setIntField(term9769, term9769.getClass(), "totalEasySync", 1143522832);
        setIntField(term9769, term9769.getClass(), "totalBasicSync", 40965975);
        setIntField(term9769, term9769.getClass(), "totalAdvancedSync", -194718582);
        setIntField(term9769, term9769.getClass(), "totalExpertSync", 42982854);
        setIntField(term9769, term9769.getClass(), "totalMasterSync", -1129506480);
        setIntField(term9769, term9769.getClass(), "totalReMasterSync", 301438568);
        setIntField(term9769, term9769.getClass(), "playerRating", -1667908453);
        setIntField(term9769, term9769.getClass(), "highestRating", 315910438);
        setIntField(term9769, term9769.getClass(), "rankAuthTailId", -1673157821);
        setField(term9769, term9769.getClass(), "eventWatchedDate", "GPSEWEDSTo");
        setField(term9769, term9769.getClass(), "webLimitDate", "RCOqfVsRHt");
        setIntField(term9769, term9769.getClass(), "challengeTrackPhase", 1217804703);
        setIntField(term9769, term9769.getClass(), "firstPlayBits", -1981494102);
        setField(term9769, term9769.getClass(), "lastPlayDate", "TSyCeEZPaT");
        setIntField(term9769, term9769.getClass(), "lastPlaceId", -2064148945);
        setField(term9769, term9769.getClass(), "lastPlaceName", "JeZFtaqkzW");
        setIntField(term9769, term9769.getClass(), "lastRegionId", 494400151);
        setField(term9769, term9769.getClass(), "lastRegionName", "vOVuNSCCLe");
        setField(term9769, term9769.getClass(), "lastClientId", "fzeqPnzpnt");
        setField(term9769, term9769.getClass(), "lastCountryCode", "RxbhrFBjkO");
        setIntField(term9769, term9769.getClass(), "eventPoint", 1588058685);
        setIntField(term9769, term9769.getClass(), "totalLv", 1677707412);
        setIntField(term9769, term9769.getClass(), "lastLoginBonusDay", -297367861);
        setIntField(term9769, term9769.getClass(), "lastSurvivalBonusDay", -1133541490);
        setIntField(term9769, term9769.getClass(), "loginBonusLv", 942412391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayBits", argTypes, term9769, args);
    }

};


