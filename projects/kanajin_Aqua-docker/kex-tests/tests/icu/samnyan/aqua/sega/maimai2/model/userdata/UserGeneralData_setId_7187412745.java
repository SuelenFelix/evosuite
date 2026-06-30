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

public class UserGeneralData_setId_7187412745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135206;
     Object term135597;

    public UserGeneralData_setId_7187412745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135212 = new Long(860079646007397083L);
        Integer term135275 = new Integer(1075321384);
        Integer term135277 = new Integer(-1726073541);
        Integer term135279 = new Integer(406945977);
        Integer term135281 = new Integer(493657684);
        Integer term135283 = new Integer(1882655922);
        Integer term135285 = new Integer(1314996390);
        Integer term135287 = new Integer(1367703658);
        Integer term135289 = new Integer(1120153100);
        ArrayList term135273 = new ArrayList();
        ((ArrayList) term135273).add(term135275);
        ((ArrayList) term135273).add(term135277);
        ((ArrayList) term135273).add(term135279);
        ((ArrayList) term135273).add(term135281);
        ((ArrayList) term135273).add(term135283);
        ((ArrayList) term135273).add(term135285);
        ((ArrayList) term135273).add(term135287);
        ((ArrayList) term135273).add(term135289);
        Integer term135295 = new Integer(158801111);
        Integer term135297 = new Integer(464966803);
        Integer term135299 = new Integer(-246618392);
        Integer term135301 = new Integer(1472246167);
        Integer term135303 = new Integer(1008555478);
        ArrayList term135293 = new ArrayList();
        ((ArrayList) term135293).add(term135295);
        ((ArrayList) term135293).add(term135297);
        ((ArrayList) term135293).add(term135299);
        ((ArrayList) term135293).add(term135301);
        ((ArrayList) term135293).add(term135303);
        term135206 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term135208 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term135210 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135241 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135206, term135206.getClass(), "id", -7626120186155328416L);
        setLongField(term135208, term135208.getClass(), "id", 3475059906318237444L);
        setLongField(term135210, term135210.getClass(), "id", -7635249609359101107L);
        setField(term135210, term135210.getClass(), "extId", term135212);
        setField(term135210, term135210.getClass(), "luid", "FYbsLyvQEc");
        setIntField(term135227, term135227.getClass(), "year", 2019);
        setShortField(term135227, term135227.getClass(), "month", (short) 11);
        setShortField(term135227, term135227.getClass(), "day", (short) 1);
        setField(term135226, term135226.getClass(), "date", term135227);
        setByteField(term135231, term135231.getClass(), "hour", (byte) 23);
        setByteField(term135231, term135231.getClass(), "minute", (byte) 29);
        setByteField(term135231, term135231.getClass(), "second", (byte) 31);
        setIntField(term135231, term135231.getClass(), "nano", 58449597);
        setField(term135226, term135226.getClass(), "time", term135231);
        setField(term135210, term135210.getClass(), "registerTime", term135226);
        setIntField(term135237, term135237.getClass(), "year", 2025);
        setShortField(term135237, term135237.getClass(), "month", (short) 2);
        setShortField(term135237, term135237.getClass(), "day", (short) 4);
        setField(term135236, term135236.getClass(), "date", term135237);
        setByteField(term135241, term135241.getClass(), "hour", (byte) 1);
        setByteField(term135241, term135241.getClass(), "minute", (byte) 30);
        setByteField(term135241, term135241.getClass(), "second", (byte) 28);
        setIntField(term135241, term135241.getClass(), "nano", 555720830);
        setField(term135236, term135236.getClass(), "time", term135241);
        setField(term135210, term135210.getClass(), "accessTime", term135236);
        setField(term135208, term135208.getClass(), "card", term135210);
        setField(term135208, term135208.getClass(), "userName", "DZVnOFFNzA");
        setIntField(term135208, term135208.getClass(), "isNetMember", -1001373806);
        setIntField(term135208, term135208.getClass(), "iconId", -1431802716);
        setIntField(term135208, term135208.getClass(), "plateId", -1927075382);
        setIntField(term135208, term135208.getClass(), "titleId", -1834614967);
        setIntField(term135208, term135208.getClass(), "partnerId", 2144962544);
        setIntField(term135208, term135208.getClass(), "frameId", 28864647);
        setIntField(term135208, term135208.getClass(), "selectMapId", 376502371);
        setIntField(term135208, term135208.getClass(), "totalAwake", -1190514622);
        setIntField(term135208, term135208.getClass(), "gradeRating", -664203259);
        setIntField(term135208, term135208.getClass(), "musicRating", 1182607812);
        setIntField(term135208, term135208.getClass(), "playerRating", -593876319);
        setIntField(term135208, term135208.getClass(), "highestRating", -319651858);
        setIntField(term135208, term135208.getClass(), "gradeRank", -1605318650);
        setIntField(term135208, term135208.getClass(), "classRank", -1715705311);
        setIntField(term135208, term135208.getClass(), "courseRank", 1583733510);
        setField(term135208, term135208.getClass(), "charaSlot", term135273);
        setField(term135208, term135208.getClass(), "charaLockSlot", term135293);
        setLongField(term135208, term135208.getClass(), "contentBit", -3903053187723489607L);
        setIntField(term135208, term135208.getClass(), "playCount", -1283509243);
        setField(term135208, term135208.getClass(), "eventWatchedDate", "UhHOlEncqe");
        setField(term135208, term135208.getClass(), "lastGameId", "BombodvByI");
        setField(term135208, term135208.getClass(), "lastRomVersion", "xWXSMsmgup");
        setField(term135208, term135208.getClass(), "lastDataVersion", "CiRiThUkzG");
        setField(term135208, term135208.getClass(), "lastLoginDate", "USOHXZaoed");
        setField(term135208, term135208.getClass(), "lastPlayDate", "sIAuMXSPLw");
        setIntField(term135208, term135208.getClass(), "lastPlayCredit", -1360455750);
        setIntField(term135208, term135208.getClass(), "lastPlayMode", -1612479152);
        setIntField(term135208, term135208.getClass(), "lastPlaceId", -1375350596);
        setField(term135208, term135208.getClass(), "lastPlaceName", "BHUMLKEWjf");
        setIntField(term135208, term135208.getClass(), "lastAllNetId", 1037044797);
        setIntField(term135208, term135208.getClass(), "lastRegionId", -236855495);
        setField(term135208, term135208.getClass(), "lastRegionName", "bCRIEMBwda");
        setField(term135208, term135208.getClass(), "lastClientId", "rJpPoVDPxO");
        setField(term135208, term135208.getClass(), "lastCountryCode", "wAzHMzePqz");
        setIntField(term135208, term135208.getClass(), "lastSelectEMoney", 1407499360);
        setIntField(term135208, term135208.getClass(), "lastSelectTicket", -824739842);
        setIntField(term135208, term135208.getClass(), "lastSelectCourse", 1736957152);
        setIntField(term135208, term135208.getClass(), "lastCountCourse", -526630921);
        setField(term135208, term135208.getClass(), "firstGameId", "apDIHttQkF");
        setField(term135208, term135208.getClass(), "firstRomVersion", "JnkpKxjKwX");
        setField(term135208, term135208.getClass(), "firstDataVersion", "QmmFUcQTWe");
        setField(term135208, term135208.getClass(), "firstPlayDate", "SrhlGLISlG");
        setField(term135208, term135208.getClass(), "compatibleCmVersion", "UPhCxQiSer");
        setField(term135208, term135208.getClass(), "dailyBonusDate", "jHjQEFLfrD");
        setField(term135208, term135208.getClass(), "dailyCourseBonusDate", "jDgLTvGduh");
        setField(term135208, term135208.getClass(), "lastPairLoginDate", "HfgMTpkgaK");
        setField(term135208, term135208.getClass(), "lastTrialPlayDate", "QUAzjGTSxv");
        setIntField(term135208, term135208.getClass(), "playVsCount", -1766101899);
        setIntField(term135208, term135208.getClass(), "playSyncCount", -1198424905);
        setIntField(term135208, term135208.getClass(), "winCount", -782844264);
        setIntField(term135208, term135208.getClass(), "helpCount", -546737664);
        setIntField(term135208, term135208.getClass(), "comboCount", 2004350139);
        setLongField(term135208, term135208.getClass(), "totalDeluxscore", -9079493792633880488L);
        setLongField(term135208, term135208.getClass(), "totalBasicDeluxscore", -4632223746452776127L);
        setLongField(term135208, term135208.getClass(), "totalAdvancedDeluxscore", -8536743617101607452L);
        setLongField(term135208, term135208.getClass(), "totalExpertDeluxscore", -7736836683933796260L);
        setLongField(term135208, term135208.getClass(), "totalMasterDeluxscore", -4412204534351657942L);
        setLongField(term135208, term135208.getClass(), "totalReMasterDeluxscore", 1502402416005720575L);
        setIntField(term135208, term135208.getClass(), "totalSync", 1239280488);
        setIntField(term135208, term135208.getClass(), "totalBasicSync", -1336481907);
        setIntField(term135208, term135208.getClass(), "totalAdvancedSync", 1804282244);
        setIntField(term135208, term135208.getClass(), "totalExpertSync", 1481607063);
        setIntField(term135208, term135208.getClass(), "totalMasterSync", 972749902);
        setIntField(term135208, term135208.getClass(), "totalReMasterSync", -1556774479);
        setLongField(term135208, term135208.getClass(), "totalAchievement", -8968751634411616639L);
        setLongField(term135208, term135208.getClass(), "totalBasicAchievement", 5717217363255266611L);
        setLongField(term135208, term135208.getClass(), "totalAdvancedAchievement", 4386790398434386143L);
        setLongField(term135208, term135208.getClass(), "totalExpertAchievement", -7382853148490912965L);
        setLongField(term135208, term135208.getClass(), "totalMasterAchievement", -4141185344985298529L);
        setLongField(term135208, term135208.getClass(), "totalReMasterAchievement", 5182118809986194172L);
        setLongField(term135208, term135208.getClass(), "playerOldRating", 7770343092404304772L);
        setLongField(term135208, term135208.getClass(), "playerNewRating", 8126336292793193625L);
        setIntField(term135208, term135208.getClass(), "banState", -74035050);
        setLongField(term135208, term135208.getClass(), "dateTime", -1515877345563579395L);
        setField(term135206, term135206.getClass(), "user", term135208);
        setField(term135206, term135206.getClass(), "propertyKey", "cIWnHZgAhI");
        setField(term135206, term135206.getClass(), "propertyValue", "vEHRRwNajA");
        term135597 = new Long(7135285391651019613L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term135597;
        callMethod(klass, "setId", argTypes, term135206, args);
    }

};


