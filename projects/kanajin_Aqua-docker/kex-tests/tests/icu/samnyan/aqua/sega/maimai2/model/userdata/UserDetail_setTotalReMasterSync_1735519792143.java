package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setTotalReMasterSync_1735519792143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277013;
     Object term277368;

    public UserDetail_setTotalReMasterSync_1735519792143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277017 = new Long(-5714578622746827780L);
        Integer term277080 = new Integer(-1547947305);
        ArrayList term277078 = new ArrayList();
        ((ArrayList) term277078).add(term277080);
        Integer term277086 = new Integer(-919225635);
        Integer term277088 = new Integer(-1044514554);
        Integer term277090 = new Integer(35189099);
        Integer term277092 = new Integer(-1399937823);
        Integer term277094 = new Integer(1439151010);
        Integer term277096 = new Integer(520109121);
        Integer term277098 = new Integer(-1374704112);
        ArrayList term277084 = new ArrayList();
        ((ArrayList) term277084).add(term277086);
        ((ArrayList) term277084).add(term277088);
        ((ArrayList) term277084).add(term277090);
        ((ArrayList) term277084).add(term277092);
        ((ArrayList) term277084).add(term277094);
        ((ArrayList) term277084).add(term277096);
        ((ArrayList) term277084).add(term277098);
        term277013 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term277015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277046 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277013, term277013.getClass(), "id", -1506368776495026917L);
        setLongField(term277015, term277015.getClass(), "id", 2465961262685222353L);
        setField(term277015, term277015.getClass(), "extId", term277017);
        setField(term277015, term277015.getClass(), "luid", "VwDwhvfpUt");
        setIntField(term277032, term277032.getClass(), "year", 2028);
        setShortField(term277032, term277032.getClass(), "month", (short) 4);
        setShortField(term277032, term277032.getClass(), "day", (short) 3);
        setField(term277031, term277031.getClass(), "date", term277032);
        setByteField(term277036, term277036.getClass(), "hour", (byte) 0);
        setByteField(term277036, term277036.getClass(), "minute", (byte) 28);
        setByteField(term277036, term277036.getClass(), "second", (byte) 50);
        setIntField(term277036, term277036.getClass(), "nano", 521054025);
        setField(term277031, term277031.getClass(), "time", term277036);
        setField(term277015, term277015.getClass(), "registerTime", term277031);
        setIntField(term277042, term277042.getClass(), "year", 2012);
        setShortField(term277042, term277042.getClass(), "month", (short) 11);
        setShortField(term277042, term277042.getClass(), "day", (short) 12);
        setField(term277041, term277041.getClass(), "date", term277042);
        setByteField(term277046, term277046.getClass(), "hour", (byte) 2);
        setByteField(term277046, term277046.getClass(), "minute", (byte) 45);
        setByteField(term277046, term277046.getClass(), "second", (byte) 14);
        setIntField(term277046, term277046.getClass(), "nano", 572497850);
        setField(term277041, term277041.getClass(), "time", term277046);
        setField(term277015, term277015.getClass(), "accessTime", term277041);
        setField(term277013, term277013.getClass(), "card", term277015);
        setField(term277013, term277013.getClass(), "userName", "zuITAkOWOf");
        setIntField(term277013, term277013.getClass(), "isNetMember", -1983580842);
        setIntField(term277013, term277013.getClass(), "iconId", 1331277023);
        setIntField(term277013, term277013.getClass(), "plateId", 947611688);
        setIntField(term277013, term277013.getClass(), "titleId", -1159146752);
        setIntField(term277013, term277013.getClass(), "partnerId", -1065436081);
        setIntField(term277013, term277013.getClass(), "frameId", 971019069);
        setIntField(term277013, term277013.getClass(), "selectMapId", -1099401229);
        setIntField(term277013, term277013.getClass(), "totalAwake", 709838754);
        setIntField(term277013, term277013.getClass(), "gradeRating", -85093106);
        setIntField(term277013, term277013.getClass(), "musicRating", -1698754374);
        setIntField(term277013, term277013.getClass(), "playerRating", 1846632663);
        setIntField(term277013, term277013.getClass(), "highestRating", -1288250590);
        setIntField(term277013, term277013.getClass(), "gradeRank", -1808201152);
        setIntField(term277013, term277013.getClass(), "classRank", -529949642);
        setIntField(term277013, term277013.getClass(), "courseRank", -76656882);
        setField(term277013, term277013.getClass(), "charaSlot", term277078);
        setField(term277013, term277013.getClass(), "charaLockSlot", term277084);
        setLongField(term277013, term277013.getClass(), "contentBit", 2343698491462329000L);
        setIntField(term277013, term277013.getClass(), "playCount", 987800835);
        setField(term277013, term277013.getClass(), "eventWatchedDate", "nOhUUQmwkx");
        setField(term277013, term277013.getClass(), "lastGameId", "qcsCzZuHeB");
        setField(term277013, term277013.getClass(), "lastRomVersion", "fwIkwuYcQV");
        setField(term277013, term277013.getClass(), "lastDataVersion", "zAFuEpkxLv");
        setField(term277013, term277013.getClass(), "lastLoginDate", "yBJjVTlfhB");
        setField(term277013, term277013.getClass(), "lastPlayDate", "HVNrCVKJTz");
        setIntField(term277013, term277013.getClass(), "lastPlayCredit", 1029114126);
        setIntField(term277013, term277013.getClass(), "lastPlayMode", 2061594658);
        setIntField(term277013, term277013.getClass(), "lastPlaceId", 1057921399);
        setField(term277013, term277013.getClass(), "lastPlaceName", "yEAAxXLmqa");
        setIntField(term277013, term277013.getClass(), "lastAllNetId", 1860531765);
        setIntField(term277013, term277013.getClass(), "lastRegionId", 1900045950);
        setField(term277013, term277013.getClass(), "lastRegionName", "eqdadDiwzd");
        setField(term277013, term277013.getClass(), "lastClientId", "tFYLzTDneK");
        setField(term277013, term277013.getClass(), "lastCountryCode", "IwWOTOxIFe");
        setIntField(term277013, term277013.getClass(), "lastSelectEMoney", 907619854);
        setIntField(term277013, term277013.getClass(), "lastSelectTicket", 1107910554);
        setIntField(term277013, term277013.getClass(), "lastSelectCourse", 778090701);
        setIntField(term277013, term277013.getClass(), "lastCountCourse", 320722712);
        setField(term277013, term277013.getClass(), "firstGameId", "hQbREUtOdY");
        setField(term277013, term277013.getClass(), "firstRomVersion", "PYGbHSlLQs");
        setField(term277013, term277013.getClass(), "firstDataVersion", "tKIPCrqYcE");
        setField(term277013, term277013.getClass(), "firstPlayDate", "epiSKrHTNO");
        setField(term277013, term277013.getClass(), "compatibleCmVersion", "WFOEQjkbXp");
        setField(term277013, term277013.getClass(), "dailyBonusDate", "BlZJucuIKY");
        setField(term277013, term277013.getClass(), "dailyCourseBonusDate", "LFHcFsKeGk");
        setField(term277013, term277013.getClass(), "lastPairLoginDate", "imfDJZDBWh");
        setField(term277013, term277013.getClass(), "lastTrialPlayDate", "QJmtwzmUnd");
        setIntField(term277013, term277013.getClass(), "playVsCount", 2093459327);
        setIntField(term277013, term277013.getClass(), "playSyncCount", 229344233);
        setIntField(term277013, term277013.getClass(), "winCount", -1916987656);
        setIntField(term277013, term277013.getClass(), "helpCount", 1801075916);
        setIntField(term277013, term277013.getClass(), "comboCount", 291364869);
        setLongField(term277013, term277013.getClass(), "totalDeluxscore", -8239722676735134543L);
        setLongField(term277013, term277013.getClass(), "totalBasicDeluxscore", -8416265007321630691L);
        setLongField(term277013, term277013.getClass(), "totalAdvancedDeluxscore", 6062531533019938891L);
        setLongField(term277013, term277013.getClass(), "totalExpertDeluxscore", -7433232326757884923L);
        setLongField(term277013, term277013.getClass(), "totalMasterDeluxscore", 2265130602305191901L);
        setLongField(term277013, term277013.getClass(), "totalReMasterDeluxscore", -1303769865692243260L);
        setIntField(term277013, term277013.getClass(), "totalSync", -1266383288);
        setIntField(term277013, term277013.getClass(), "totalBasicSync", 657464621);
        setIntField(term277013, term277013.getClass(), "totalAdvancedSync", 535916307);
        setIntField(term277013, term277013.getClass(), "totalExpertSync", 1217567885);
        setIntField(term277013, term277013.getClass(), "totalMasterSync", -1677196593);
        setIntField(term277013, term277013.getClass(), "totalReMasterSync", 1628523425);
        setLongField(term277013, term277013.getClass(), "totalAchievement", 7078912319065901390L);
        setLongField(term277013, term277013.getClass(), "totalBasicAchievement", 2769055639048156740L);
        setLongField(term277013, term277013.getClass(), "totalAdvancedAchievement", 7383065117376920433L);
        setLongField(term277013, term277013.getClass(), "totalExpertAchievement", 1265785580498916307L);
        setLongField(term277013, term277013.getClass(), "totalMasterAchievement", 4857699315407075467L);
        setLongField(term277013, term277013.getClass(), "totalReMasterAchievement", 5530335774057784394L);
        setLongField(term277013, term277013.getClass(), "playerOldRating", 7292303710366467346L);
        setLongField(term277013, term277013.getClass(), "playerNewRating", 7529112529119390322L);
        setIntField(term277013, term277013.getClass(), "banState", 270590291);
        setLongField(term277013, term277013.getClass(), "dateTime", -2238983078615920969L);
        term277368 = new Integer(1699156979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277368;
        callMethod(klass, "setTotalReMasterSync", argTypes, term277013, args);
    }

};


