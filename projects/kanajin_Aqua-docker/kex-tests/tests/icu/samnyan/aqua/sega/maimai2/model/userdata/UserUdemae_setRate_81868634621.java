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

public class UserUdemae_setRate_81868634621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107229;
     Object term107594;

    public UserUdemae_setRate_81868634621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107235 = new Long(3427570961451840069L);
        Integer term107298 = new Integer(-2061712635);
        Integer term107300 = new Integer(1182911731);
        Integer term107302 = new Integer(644726932);
        Integer term107304 = new Integer(-1515977761);
        ArrayList term107296 = new ArrayList();
        ((ArrayList) term107296).add(term107298);
        ((ArrayList) term107296).add(term107300);
        ((ArrayList) term107296).add(term107302);
        ((ArrayList) term107296).add(term107304);
        ArrayList term107308 = new ArrayList();
        term107229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term107231 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term107233 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107229, term107229.getClass(), "id", -2504382987386570729L);
        setLongField(term107231, term107231.getClass(), "id", 520896091063818935L);
        setLongField(term107233, term107233.getClass(), "id", -7763535196525474654L);
        setField(term107233, term107233.getClass(), "extId", term107235);
        setField(term107233, term107233.getClass(), "luid", "kBdJQbVecB");
        setIntField(term107250, term107250.getClass(), "year", 2021);
        setShortField(term107250, term107250.getClass(), "month", (short) 7);
        setShortField(term107250, term107250.getClass(), "day", (short) 2);
        setField(term107249, term107249.getClass(), "date", term107250);
        setByteField(term107254, term107254.getClass(), "hour", (byte) 21);
        setByteField(term107254, term107254.getClass(), "minute", (byte) 55);
        setByteField(term107254, term107254.getClass(), "second", (byte) 54);
        setIntField(term107254, term107254.getClass(), "nano", 731983440);
        setField(term107249, term107249.getClass(), "time", term107254);
        setField(term107233, term107233.getClass(), "registerTime", term107249);
        setIntField(term107260, term107260.getClass(), "year", 2022);
        setShortField(term107260, term107260.getClass(), "month", (short) 10);
        setShortField(term107260, term107260.getClass(), "day", (short) 14);
        setField(term107259, term107259.getClass(), "date", term107260);
        setByteField(term107264, term107264.getClass(), "hour", (byte) 7);
        setByteField(term107264, term107264.getClass(), "minute", (byte) 29);
        setByteField(term107264, term107264.getClass(), "second", (byte) 42);
        setIntField(term107264, term107264.getClass(), "nano", 962865996);
        setField(term107259, term107259.getClass(), "time", term107264);
        setField(term107233, term107233.getClass(), "accessTime", term107259);
        setField(term107231, term107231.getClass(), "card", term107233);
        setField(term107231, term107231.getClass(), "userName", "JlirfQsPTm");
        setIntField(term107231, term107231.getClass(), "isNetMember", -289519625);
        setIntField(term107231, term107231.getClass(), "iconId", -495258347);
        setIntField(term107231, term107231.getClass(), "plateId", 1581720562);
        setIntField(term107231, term107231.getClass(), "titleId", 17092444);
        setIntField(term107231, term107231.getClass(), "partnerId", 1646931775);
        setIntField(term107231, term107231.getClass(), "frameId", 852601791);
        setIntField(term107231, term107231.getClass(), "selectMapId", 398280959);
        setIntField(term107231, term107231.getClass(), "totalAwake", -258521262);
        setIntField(term107231, term107231.getClass(), "gradeRating", 1217456071);
        setIntField(term107231, term107231.getClass(), "musicRating", 651030320);
        setIntField(term107231, term107231.getClass(), "playerRating", -1538279121);
        setIntField(term107231, term107231.getClass(), "highestRating", -64171030);
        setIntField(term107231, term107231.getClass(), "gradeRank", -1799451766);
        setIntField(term107231, term107231.getClass(), "classRank", -1576640496);
        setIntField(term107231, term107231.getClass(), "courseRank", 12609042);
        setField(term107231, term107231.getClass(), "charaSlot", term107296);
        setField(term107231, term107231.getClass(), "charaLockSlot", term107308);
        setLongField(term107231, term107231.getClass(), "contentBit", -304098044779776461L);
        setIntField(term107231, term107231.getClass(), "playCount", -184191841);
        setField(term107231, term107231.getClass(), "eventWatchedDate", "jqfJtiVFaf");
        setField(term107231, term107231.getClass(), "lastGameId", "ZvqUprynBE");
        setField(term107231, term107231.getClass(), "lastRomVersion", "WFTVkzwtMV");
        setField(term107231, term107231.getClass(), "lastDataVersion", "NFhdyebxdy");
        setField(term107231, term107231.getClass(), "lastLoginDate", "tLWbdOibIF");
        setField(term107231, term107231.getClass(), "lastPlayDate", "SMOAkwbjOJ");
        setIntField(term107231, term107231.getClass(), "lastPlayCredit", -238927593);
        setIntField(term107231, term107231.getClass(), "lastPlayMode", -2130505195);
        setIntField(term107231, term107231.getClass(), "lastPlaceId", 80166636);
        setField(term107231, term107231.getClass(), "lastPlaceName", "MfaucIGOtB");
        setIntField(term107231, term107231.getClass(), "lastAllNetId", -142617740);
        setIntField(term107231, term107231.getClass(), "lastRegionId", 1932617639);
        setField(term107231, term107231.getClass(), "lastRegionName", "InUomUyBlU");
        setField(term107231, term107231.getClass(), "lastClientId", "JeDxEhXsPC");
        setField(term107231, term107231.getClass(), "lastCountryCode", "VAGxXrcAsi");
        setIntField(term107231, term107231.getClass(), "lastSelectEMoney", -102676348);
        setIntField(term107231, term107231.getClass(), "lastSelectTicket", -438825744);
        setIntField(term107231, term107231.getClass(), "lastSelectCourse", -182534382);
        setIntField(term107231, term107231.getClass(), "lastCountCourse", 375976050);
        setField(term107231, term107231.getClass(), "firstGameId", "ApYkVuFRIL");
        setField(term107231, term107231.getClass(), "firstRomVersion", "diuhMpMKFr");
        setField(term107231, term107231.getClass(), "firstDataVersion", "jYgdYPEnbw");
        setField(term107231, term107231.getClass(), "firstPlayDate", "MaWPQSNeis");
        setField(term107231, term107231.getClass(), "compatibleCmVersion", "SiShLTAOSK");
        setField(term107231, term107231.getClass(), "dailyBonusDate", "FAPbpaVZzb");
        setField(term107231, term107231.getClass(), "dailyCourseBonusDate", "jMmGJiFUkL");
        setField(term107231, term107231.getClass(), "lastPairLoginDate", "fHyUJhfoxR");
        setField(term107231, term107231.getClass(), "lastTrialPlayDate", "CgnkREXVNP");
        setIntField(term107231, term107231.getClass(), "playVsCount", -1932003593);
        setIntField(term107231, term107231.getClass(), "playSyncCount", 1475174061);
        setIntField(term107231, term107231.getClass(), "winCount", -1586912461);
        setIntField(term107231, term107231.getClass(), "helpCount", -25528003);
        setIntField(term107231, term107231.getClass(), "comboCount", 1719470688);
        setLongField(term107231, term107231.getClass(), "totalDeluxscore", 5045856503514343478L);
        setLongField(term107231, term107231.getClass(), "totalBasicDeluxscore", -1793258933453544024L);
        setLongField(term107231, term107231.getClass(), "totalAdvancedDeluxscore", -3474751564535185716L);
        setLongField(term107231, term107231.getClass(), "totalExpertDeluxscore", 3013432206371270776L);
        setLongField(term107231, term107231.getClass(), "totalMasterDeluxscore", -6757564870085101374L);
        setLongField(term107231, term107231.getClass(), "totalReMasterDeluxscore", -3649984910149412233L);
        setIntField(term107231, term107231.getClass(), "totalSync", 1817327304);
        setIntField(term107231, term107231.getClass(), "totalBasicSync", -1498307773);
        setIntField(term107231, term107231.getClass(), "totalAdvancedSync", -919077833);
        setIntField(term107231, term107231.getClass(), "totalExpertSync", 86490701);
        setIntField(term107231, term107231.getClass(), "totalMasterSync", -406097429);
        setIntField(term107231, term107231.getClass(), "totalReMasterSync", 473643844);
        setLongField(term107231, term107231.getClass(), "totalAchievement", 7593602767052909314L);
        setLongField(term107231, term107231.getClass(), "totalBasicAchievement", 7009846690732806829L);
        setLongField(term107231, term107231.getClass(), "totalAdvancedAchievement", 8159301017712143715L);
        setLongField(term107231, term107231.getClass(), "totalExpertAchievement", 7716553209665440346L);
        setLongField(term107231, term107231.getClass(), "totalMasterAchievement", 2104945851697951566L);
        setLongField(term107231, term107231.getClass(), "totalReMasterAchievement", 2226274535113455673L);
        setLongField(term107231, term107231.getClass(), "playerOldRating", -3483009961035969884L);
        setLongField(term107231, term107231.getClass(), "playerNewRating", -6330284814052668407L);
        setIntField(term107231, term107231.getClass(), "banState", 1336551685);
        setLongField(term107231, term107231.getClass(), "dateTime", 151946226512995551L);
        setField(term107229, term107229.getClass(), "user", term107231);
        setIntField(term107229, term107229.getClass(), "rate", -171146643);
        setIntField(term107229, term107229.getClass(), "maxRate", 1243420669);
        setIntField(term107229, term107229.getClass(), "classValue", 1961265905);
        setIntField(term107229, term107229.getClass(), "maxClassValue", -194331877);
        setIntField(term107229, term107229.getClass(), "totalWinNum", -948751278);
        setIntField(term107229, term107229.getClass(), "totalLoseNum", -403239789);
        setIntField(term107229, term107229.getClass(), "maxWinNum", 1919856422);
        setIntField(term107229, term107229.getClass(), "maxLoseNum", 1075667277);
        setIntField(term107229, term107229.getClass(), "winNum", 523284856);
        setIntField(term107229, term107229.getClass(), "loseNum", -1189621083);
        setIntField(term107229, term107229.getClass(), "npcTotalWinNum", -1476735618);
        setIntField(term107229, term107229.getClass(), "npcTotalLoseNum", -1126757723);
        setIntField(term107229, term107229.getClass(), "npcMaxWinNum", -1650915963);
        setIntField(term107229, term107229.getClass(), "npcMaxLoseNum", 1043027844);
        setIntField(term107229, term107229.getClass(), "npcWinNum", 893498941);
        setIntField(term107229, term107229.getClass(), "npcLoseNum", -1645433738);
        term107594 = new Integer(170899666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107594;
        callMethod(klass, "setRate", argTypes, term107229, args);
    }

};


