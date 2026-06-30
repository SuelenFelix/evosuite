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

public class UserCourse_setTotalDeluxscore_107279458621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85228;
     Object term85649;

    public UserCourse_setTotalDeluxscore_107279458621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85234 = new Long(855932984568615096L);
        Integer term85297 = new Integer(1112256038);
        Integer term85299 = new Integer(-441333794);
        Integer term85301 = new Integer(1504698817);
        Integer term85303 = new Integer(-2018333791);
        Integer term85305 = new Integer(-742476678);
        Integer term85307 = new Integer(-824369460);
        Integer term85309 = new Integer(-1573760035);
        ArrayList term85295 = new ArrayList();
        ((ArrayList) term85295).add(term85297);
        ((ArrayList) term85295).add(term85299);
        ((ArrayList) term85295).add(term85301);
        ((ArrayList) term85295).add(term85303);
        ((ArrayList) term85295).add(term85305);
        ((ArrayList) term85295).add(term85307);
        ((ArrayList) term85295).add(term85309);
        Integer term85315 = new Integer(-1147965121);
        Integer term85317 = new Integer(-867099093);
        Integer term85319 = new Integer(-1091199008);
        Integer term85321 = new Integer(1837886253);
        Integer term85323 = new Integer(-269528550);
        ArrayList term85313 = new ArrayList();
        ((ArrayList) term85313).add(term85315);
        ((ArrayList) term85313).add(term85317);
        ((ArrayList) term85313).add(term85319);
        ((ArrayList) term85313).add(term85321);
        ((ArrayList) term85313).add(term85323);
        term85228 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term85230 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term85232 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85253 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85263 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85228, term85228.getClass(), "id", 152811277002165908L);
        setLongField(term85230, term85230.getClass(), "id", 858905884211038396L);
        setLongField(term85232, term85232.getClass(), "id", -3998925841183367920L);
        setField(term85232, term85232.getClass(), "extId", term85234);
        setField(term85232, term85232.getClass(), "luid", "tZiwBSETUL");
        setIntField(term85249, term85249.getClass(), "year", 2015);
        setShortField(term85249, term85249.getClass(), "month", (short) 4);
        setShortField(term85249, term85249.getClass(), "day", (short) 22);
        setField(term85248, term85248.getClass(), "date", term85249);
        setByteField(term85253, term85253.getClass(), "hour", (byte) 15);
        setByteField(term85253, term85253.getClass(), "minute", (byte) 23);
        setByteField(term85253, term85253.getClass(), "second", (byte) 42);
        setIntField(term85253, term85253.getClass(), "nano", 822658620);
        setField(term85248, term85248.getClass(), "time", term85253);
        setField(term85232, term85232.getClass(), "registerTime", term85248);
        setIntField(term85259, term85259.getClass(), "year", 2020);
        setShortField(term85259, term85259.getClass(), "month", (short) 4);
        setShortField(term85259, term85259.getClass(), "day", (short) 27);
        setField(term85258, term85258.getClass(), "date", term85259);
        setByteField(term85263, term85263.getClass(), "hour", (byte) 16);
        setByteField(term85263, term85263.getClass(), "minute", (byte) 48);
        setByteField(term85263, term85263.getClass(), "second", (byte) 39);
        setIntField(term85263, term85263.getClass(), "nano", 250909266);
        setField(term85258, term85258.getClass(), "time", term85263);
        setField(term85232, term85232.getClass(), "accessTime", term85258);
        setField(term85230, term85230.getClass(), "card", term85232);
        setField(term85230, term85230.getClass(), "userName", "fmecFLYSIi");
        setIntField(term85230, term85230.getClass(), "isNetMember", 691240568);
        setIntField(term85230, term85230.getClass(), "iconId", 1689565461);
        setIntField(term85230, term85230.getClass(), "plateId", 1105348026);
        setIntField(term85230, term85230.getClass(), "titleId", -35374943);
        setIntField(term85230, term85230.getClass(), "partnerId", -561318198);
        setIntField(term85230, term85230.getClass(), "frameId", -1196585904);
        setIntField(term85230, term85230.getClass(), "selectMapId", 123352569);
        setIntField(term85230, term85230.getClass(), "totalAwake", 2027326435);
        setIntField(term85230, term85230.getClass(), "gradeRating", 1185859348);
        setIntField(term85230, term85230.getClass(), "musicRating", -1963285488);
        setIntField(term85230, term85230.getClass(), "playerRating", 390373954);
        setIntField(term85230, term85230.getClass(), "highestRating", 1525579039);
        setIntField(term85230, term85230.getClass(), "gradeRank", -509784163);
        setIntField(term85230, term85230.getClass(), "classRank", 1503484564);
        setIntField(term85230, term85230.getClass(), "courseRank", -433236731);
        setField(term85230, term85230.getClass(), "charaSlot", term85295);
        setField(term85230, term85230.getClass(), "charaLockSlot", term85313);
        setLongField(term85230, term85230.getClass(), "contentBit", 397709034253708478L);
        setIntField(term85230, term85230.getClass(), "playCount", 2003700950);
        setField(term85230, term85230.getClass(), "eventWatchedDate", "bjjsWtQeyp");
        setField(term85230, term85230.getClass(), "lastGameId", "CoPgTYdcst");
        setField(term85230, term85230.getClass(), "lastRomVersion", "UYWsaWaOUS");
        setField(term85230, term85230.getClass(), "lastDataVersion", "oOxKzvqxUJ");
        setField(term85230, term85230.getClass(), "lastLoginDate", "tjqgiPrtgj");
        setField(term85230, term85230.getClass(), "lastPlayDate", "atajdBiCpk");
        setIntField(term85230, term85230.getClass(), "lastPlayCredit", -1309376267);
        setIntField(term85230, term85230.getClass(), "lastPlayMode", -1487504399);
        setIntField(term85230, term85230.getClass(), "lastPlaceId", -345174419);
        setField(term85230, term85230.getClass(), "lastPlaceName", "iZkNHOfNWw");
        setIntField(term85230, term85230.getClass(), "lastAllNetId", 1676102379);
        setIntField(term85230, term85230.getClass(), "lastRegionId", 1215582502);
        setField(term85230, term85230.getClass(), "lastRegionName", "SxvlCppquX");
        setField(term85230, term85230.getClass(), "lastClientId", "KXtTCHHVWr");
        setField(term85230, term85230.getClass(), "lastCountryCode", "ylbTmYKeKr");
        setIntField(term85230, term85230.getClass(), "lastSelectEMoney", 997123385);
        setIntField(term85230, term85230.getClass(), "lastSelectTicket", -171991376);
        setIntField(term85230, term85230.getClass(), "lastSelectCourse", 1966933092);
        setIntField(term85230, term85230.getClass(), "lastCountCourse", 1108791337);
        setField(term85230, term85230.getClass(), "firstGameId", "iyKZenGXgC");
        setField(term85230, term85230.getClass(), "firstRomVersion", "jgPUpbSRNf");
        setField(term85230, term85230.getClass(), "firstDataVersion", "GHKReaUGqB");
        setField(term85230, term85230.getClass(), "firstPlayDate", "oWFgLqbhiK");
        setField(term85230, term85230.getClass(), "compatibleCmVersion", "gyLdvdOJQs");
        setField(term85230, term85230.getClass(), "dailyBonusDate", "PASAYkwcOc");
        setField(term85230, term85230.getClass(), "dailyCourseBonusDate", "aeiojdusXr");
        setField(term85230, term85230.getClass(), "lastPairLoginDate", "KKgjZsGDBV");
        setField(term85230, term85230.getClass(), "lastTrialPlayDate", "EkIjtjomYk");
        setIntField(term85230, term85230.getClass(), "playVsCount", -414682663);
        setIntField(term85230, term85230.getClass(), "playSyncCount", 259051944);
        setIntField(term85230, term85230.getClass(), "winCount", -958789263);
        setIntField(term85230, term85230.getClass(), "helpCount", 120623003);
        setIntField(term85230, term85230.getClass(), "comboCount", -1236935869);
        setLongField(term85230, term85230.getClass(), "totalDeluxscore", 1177841659738819583L);
        setLongField(term85230, term85230.getClass(), "totalBasicDeluxscore", 2046502707476774311L);
        setLongField(term85230, term85230.getClass(), "totalAdvancedDeluxscore", 2858054432801655096L);
        setLongField(term85230, term85230.getClass(), "totalExpertDeluxscore", 7592342194406039680L);
        setLongField(term85230, term85230.getClass(), "totalMasterDeluxscore", 2743687876169258951L);
        setLongField(term85230, term85230.getClass(), "totalReMasterDeluxscore", 4986949395725716497L);
        setIntField(term85230, term85230.getClass(), "totalSync", -1707868253);
        setIntField(term85230, term85230.getClass(), "totalBasicSync", 487083950);
        setIntField(term85230, term85230.getClass(), "totalAdvancedSync", 33771952);
        setIntField(term85230, term85230.getClass(), "totalExpertSync", -732008756);
        setIntField(term85230, term85230.getClass(), "totalMasterSync", -1750902922);
        setIntField(term85230, term85230.getClass(), "totalReMasterSync", -1037994843);
        setLongField(term85230, term85230.getClass(), "totalAchievement", 3710266125279855888L);
        setLongField(term85230, term85230.getClass(), "totalBasicAchievement", -2390242218450551640L);
        setLongField(term85230, term85230.getClass(), "totalAdvancedAchievement", 6410411768623434810L);
        setLongField(term85230, term85230.getClass(), "totalExpertAchievement", 531588883096789016L);
        setLongField(term85230, term85230.getClass(), "totalMasterAchievement", 6836437118639426505L);
        setLongField(term85230, term85230.getClass(), "totalReMasterAchievement", -4331507977193439740L);
        setLongField(term85230, term85230.getClass(), "playerOldRating", -9195513111314648691L);
        setLongField(term85230, term85230.getClass(), "playerNewRating", -2836676267610333091L);
        setIntField(term85230, term85230.getClass(), "banState", 727200615);
        setLongField(term85230, term85230.getClass(), "dateTime", 3399508076702974138L);
        setField(term85228, term85228.getClass(), "user", term85230);
        setIntField(term85228, term85228.getClass(), "courseId", -308494890);
        setBooleanField(term85228, term85228.getClass(), "isLastClear", true);
        setIntField(term85228, term85228.getClass(), "totalRestlife", -1113508392);
        setIntField(term85228, term85228.getClass(), "totalAchievement", 31876246);
        setIntField(term85228, term85228.getClass(), "totalDeluxscore", 55952895);
        setIntField(term85228, term85228.getClass(), "playCount", -1961513935);
        setField(term85228, term85228.getClass(), "clearDate", "ZOUuaTJRXe");
        setField(term85228, term85228.getClass(), "lastPlayDate", "gIyzpvuRnO");
        setIntField(term85228, term85228.getClass(), "bestAchievement", -22602260);
        setField(term85228, term85228.getClass(), "bestAchievementDate", "oLFNhFdMBL");
        setIntField(term85228, term85228.getClass(), "bestDeluxscore", -1494996615);
        setField(term85228, term85228.getClass(), "bestDeluxscoreDate", "umJDDpmFWA");
        term85649 = new Integer(-686175319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term85649;
        callMethod(klass, "setTotalDeluxscore", argTypes, term85228, args);
    }

};


