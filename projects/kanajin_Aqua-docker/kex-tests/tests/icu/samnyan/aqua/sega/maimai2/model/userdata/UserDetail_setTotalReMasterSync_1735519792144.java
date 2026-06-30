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

public class UserDetail_setTotalReMasterSync_1735519792144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277068;
     Object term277423;

    public UserDetail_setTotalReMasterSync_1735519792144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277072 = new Long(-5714578622746827780L);
        Integer term277135 = new Integer(-1547947305);
        ArrayList term277133 = new ArrayList();
        ((ArrayList) term277133).add(term277135);
        Integer term277141 = new Integer(-919225635);
        Integer term277143 = new Integer(-1044514554);
        Integer term277145 = new Integer(35189099);
        Integer term277147 = new Integer(-1399937823);
        Integer term277149 = new Integer(1439151010);
        Integer term277151 = new Integer(520109121);
        Integer term277153 = new Integer(-1374704112);
        ArrayList term277139 = new ArrayList();
        ((ArrayList) term277139).add(term277141);
        ((ArrayList) term277139).add(term277143);
        ((ArrayList) term277139).add(term277145);
        ((ArrayList) term277139).add(term277147);
        ((ArrayList) term277139).add(term277149);
        ((ArrayList) term277139).add(term277151);
        ((ArrayList) term277139).add(term277153);
        term277068 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term277070 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277101 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277068, term277068.getClass(), "id", -1506368776495026917L);
        setLongField(term277070, term277070.getClass(), "id", 2465961262685222353L);
        setField(term277070, term277070.getClass(), "extId", term277072);
        setField(term277070, term277070.getClass(), "luid", "VwDwhvfpUt");
        setIntField(term277087, term277087.getClass(), "year", 2028);
        setShortField(term277087, term277087.getClass(), "month", (short) 4);
        setShortField(term277087, term277087.getClass(), "day", (short) 3);
        setField(term277086, term277086.getClass(), "date", term277087);
        setByteField(term277091, term277091.getClass(), "hour", (byte) 0);
        setByteField(term277091, term277091.getClass(), "minute", (byte) 28);
        setByteField(term277091, term277091.getClass(), "second", (byte) 50);
        setIntField(term277091, term277091.getClass(), "nano", 521054025);
        setField(term277086, term277086.getClass(), "time", term277091);
        setField(term277070, term277070.getClass(), "registerTime", term277086);
        setIntField(term277097, term277097.getClass(), "year", 2012);
        setShortField(term277097, term277097.getClass(), "month", (short) 11);
        setShortField(term277097, term277097.getClass(), "day", (short) 12);
        setField(term277096, term277096.getClass(), "date", term277097);
        setByteField(term277101, term277101.getClass(), "hour", (byte) 2);
        setByteField(term277101, term277101.getClass(), "minute", (byte) 45);
        setByteField(term277101, term277101.getClass(), "second", (byte) 14);
        setIntField(term277101, term277101.getClass(), "nano", 572497850);
        setField(term277096, term277096.getClass(), "time", term277101);
        setField(term277070, term277070.getClass(), "accessTime", term277096);
        setField(term277068, term277068.getClass(), "card", term277070);
        setField(term277068, term277068.getClass(), "userName", "zuITAkOWOf");
        setIntField(term277068, term277068.getClass(), "isNetMember", -1983580842);
        setIntField(term277068, term277068.getClass(), "iconId", 1331277023);
        setIntField(term277068, term277068.getClass(), "plateId", 947611688);
        setIntField(term277068, term277068.getClass(), "titleId", -1159146752);
        setIntField(term277068, term277068.getClass(), "partnerId", -1065436081);
        setIntField(term277068, term277068.getClass(), "frameId", 971019069);
        setIntField(term277068, term277068.getClass(), "selectMapId", -1099401229);
        setIntField(term277068, term277068.getClass(), "totalAwake", 709838754);
        setIntField(term277068, term277068.getClass(), "gradeRating", -85093106);
        setIntField(term277068, term277068.getClass(), "musicRating", -1698754374);
        setIntField(term277068, term277068.getClass(), "playerRating", 1846632663);
        setIntField(term277068, term277068.getClass(), "highestRating", -1288250590);
        setIntField(term277068, term277068.getClass(), "gradeRank", -1808201152);
        setIntField(term277068, term277068.getClass(), "classRank", -529949642);
        setIntField(term277068, term277068.getClass(), "courseRank", -76656882);
        setField(term277068, term277068.getClass(), "charaSlot", term277133);
        setField(term277068, term277068.getClass(), "charaLockSlot", term277139);
        setLongField(term277068, term277068.getClass(), "contentBit", 2343698491462329000L);
        setIntField(term277068, term277068.getClass(), "playCount", 987800835);
        setField(term277068, term277068.getClass(), "eventWatchedDate", "nOhUUQmwkx");
        setField(term277068, term277068.getClass(), "lastGameId", "qcsCzZuHeB");
        setField(term277068, term277068.getClass(), "lastRomVersion", "fwIkwuYcQV");
        setField(term277068, term277068.getClass(), "lastDataVersion", "zAFuEpkxLv");
        setField(term277068, term277068.getClass(), "lastLoginDate", "yBJjVTlfhB");
        setField(term277068, term277068.getClass(), "lastPlayDate", "HVNrCVKJTz");
        setIntField(term277068, term277068.getClass(), "lastPlayCredit", 1029114126);
        setIntField(term277068, term277068.getClass(), "lastPlayMode", 2061594658);
        setIntField(term277068, term277068.getClass(), "lastPlaceId", 1057921399);
        setField(term277068, term277068.getClass(), "lastPlaceName", "yEAAxXLmqa");
        setIntField(term277068, term277068.getClass(), "lastAllNetId", 1860531765);
        setIntField(term277068, term277068.getClass(), "lastRegionId", 1900045950);
        setField(term277068, term277068.getClass(), "lastRegionName", "eqdadDiwzd");
        setField(term277068, term277068.getClass(), "lastClientId", "tFYLzTDneK");
        setField(term277068, term277068.getClass(), "lastCountryCode", "IwWOTOxIFe");
        setIntField(term277068, term277068.getClass(), "lastSelectEMoney", 907619854);
        setIntField(term277068, term277068.getClass(), "lastSelectTicket", 1107910554);
        setIntField(term277068, term277068.getClass(), "lastSelectCourse", 778090701);
        setIntField(term277068, term277068.getClass(), "lastCountCourse", 320722712);
        setField(term277068, term277068.getClass(), "firstGameId", "hQbREUtOdY");
        setField(term277068, term277068.getClass(), "firstRomVersion", "PYGbHSlLQs");
        setField(term277068, term277068.getClass(), "firstDataVersion", "tKIPCrqYcE");
        setField(term277068, term277068.getClass(), "firstPlayDate", "epiSKrHTNO");
        setField(term277068, term277068.getClass(), "compatibleCmVersion", "WFOEQjkbXp");
        setField(term277068, term277068.getClass(), "dailyBonusDate", "BlZJucuIKY");
        setField(term277068, term277068.getClass(), "dailyCourseBonusDate", "LFHcFsKeGk");
        setField(term277068, term277068.getClass(), "lastPairLoginDate", "imfDJZDBWh");
        setField(term277068, term277068.getClass(), "lastTrialPlayDate", "QJmtwzmUnd");
        setIntField(term277068, term277068.getClass(), "playVsCount", 2093459327);
        setIntField(term277068, term277068.getClass(), "playSyncCount", 229344233);
        setIntField(term277068, term277068.getClass(), "winCount", -1916987656);
        setIntField(term277068, term277068.getClass(), "helpCount", 1801075916);
        setIntField(term277068, term277068.getClass(), "comboCount", 291364869);
        setLongField(term277068, term277068.getClass(), "totalDeluxscore", -8239722676735134543L);
        setLongField(term277068, term277068.getClass(), "totalBasicDeluxscore", -8416265007321630691L);
        setLongField(term277068, term277068.getClass(), "totalAdvancedDeluxscore", 6062531533019938891L);
        setLongField(term277068, term277068.getClass(), "totalExpertDeluxscore", -7433232326757884923L);
        setLongField(term277068, term277068.getClass(), "totalMasterDeluxscore", 2265130602305191901L);
        setLongField(term277068, term277068.getClass(), "totalReMasterDeluxscore", -1303769865692243260L);
        setIntField(term277068, term277068.getClass(), "totalSync", -1266383288);
        setIntField(term277068, term277068.getClass(), "totalBasicSync", 657464621);
        setIntField(term277068, term277068.getClass(), "totalAdvancedSync", 535916307);
        setIntField(term277068, term277068.getClass(), "totalExpertSync", 1217567885);
        setIntField(term277068, term277068.getClass(), "totalMasterSync", -1677196593);
        setIntField(term277068, term277068.getClass(), "totalReMasterSync", 1628523425);
        setLongField(term277068, term277068.getClass(), "totalAchievement", 7078912319065901390L);
        setLongField(term277068, term277068.getClass(), "totalBasicAchievement", 2769055639048156740L);
        setLongField(term277068, term277068.getClass(), "totalAdvancedAchievement", 7383065117376920433L);
        setLongField(term277068, term277068.getClass(), "totalExpertAchievement", 1265785580498916307L);
        setLongField(term277068, term277068.getClass(), "totalMasterAchievement", 4857699315407075467L);
        setLongField(term277068, term277068.getClass(), "totalReMasterAchievement", 5530335774057784394L);
        setLongField(term277068, term277068.getClass(), "playerOldRating", 7292303710366467346L);
        setLongField(term277068, term277068.getClass(), "playerNewRating", 7529112529119390322L);
        setIntField(term277068, term277068.getClass(), "banState", 270590291);
        setLongField(term277068, term277068.getClass(), "dateTime", -2238983078615920969L);
        term277423 = new Integer(1699156979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277423;
        callMethod(klass, "setTotalReMasterSync", argTypes, term277068, args);
    }

};


