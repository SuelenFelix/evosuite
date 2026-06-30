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

public class UserExtend_getSelectedCardList_208098978815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150317;

    public UserExtend_getSelectedCardList_208098978815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150323 = new Long(-3277773415369003529L);
        Integer term150386 = new Integer(712181359);
        Integer term150388 = new Integer(-1943255435);
        Integer term150390 = new Integer(868436312);
        Integer term150392 = new Integer(1737963071);
        ArrayList term150384 = new ArrayList();
        ((ArrayList) term150384).add(term150386);
        ((ArrayList) term150384).add(term150388);
        ((ArrayList) term150384).add(term150390);
        ((ArrayList) term150384).add(term150392);
        Integer term150398 = new Integer(6456997);
        ArrayList term150396 = new ArrayList();
        ((ArrayList) term150396).add(term150398);
        Integer term150682 = new Integer(-797269627);
        Integer term150684 = new Integer(-224331928);
        Integer term150686 = new Integer(-587857163);
        Integer term150688 = new Integer(-2018093075);
        Integer term150690 = new Integer(135879009);
        Integer term150692 = new Integer(1923027847);
        Integer term150694 = new Integer(-1652693609);
        ArrayList term150680 = new ArrayList();
        ((ArrayList) term150680).add(term150682);
        ((ArrayList) term150680).add(term150684);
        ((ArrayList) term150680).add(term150686);
        ((ArrayList) term150680).add(term150688);
        ((ArrayList) term150680).add(term150690);
        ((ArrayList) term150680).add(term150692);
        ((ArrayList) term150680).add(term150694);
        ArrayList term150698 = new ArrayList();
        term150317 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term150319 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term150321 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150342 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150352 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150317, term150317.getClass(), "id", -8684161854490465834L);
        setLongField(term150319, term150319.getClass(), "id", 763951947116346948L);
        setLongField(term150321, term150321.getClass(), "id", -6694203205302047100L);
        setField(term150321, term150321.getClass(), "extId", term150323);
        setField(term150321, term150321.getClass(), "luid", "hefxCEhnuL");
        setIntField(term150338, term150338.getClass(), "year", 2020);
        setShortField(term150338, term150338.getClass(), "month", (short) 12);
        setShortField(term150338, term150338.getClass(), "day", (short) 10);
        setField(term150337, term150337.getClass(), "date", term150338);
        setByteField(term150342, term150342.getClass(), "hour", (byte) 3);
        setByteField(term150342, term150342.getClass(), "minute", (byte) 40);
        setByteField(term150342, term150342.getClass(), "second", (byte) 14);
        setIntField(term150342, term150342.getClass(), "nano", 879978907);
        setField(term150337, term150337.getClass(), "time", term150342);
        setField(term150321, term150321.getClass(), "registerTime", term150337);
        setIntField(term150348, term150348.getClass(), "year", 2010);
        setShortField(term150348, term150348.getClass(), "month", (short) 3);
        setShortField(term150348, term150348.getClass(), "day", (short) 31);
        setField(term150347, term150347.getClass(), "date", term150348);
        setByteField(term150352, term150352.getClass(), "hour", (byte) 17);
        setByteField(term150352, term150352.getClass(), "minute", (byte) 7);
        setByteField(term150352, term150352.getClass(), "second", (byte) 55);
        setIntField(term150352, term150352.getClass(), "nano", 725965566);
        setField(term150347, term150347.getClass(), "time", term150352);
        setField(term150321, term150321.getClass(), "accessTime", term150347);
        setField(term150319, term150319.getClass(), "card", term150321);
        setField(term150319, term150319.getClass(), "userName", "nAZCgcAqKF");
        setIntField(term150319, term150319.getClass(), "isNetMember", 1896542364);
        setIntField(term150319, term150319.getClass(), "iconId", -1056985553);
        setIntField(term150319, term150319.getClass(), "plateId", 838641171);
        setIntField(term150319, term150319.getClass(), "titleId", -1468936780);
        setIntField(term150319, term150319.getClass(), "partnerId", 64970847);
        setIntField(term150319, term150319.getClass(), "frameId", 1468120818);
        setIntField(term150319, term150319.getClass(), "selectMapId", -575994877);
        setIntField(term150319, term150319.getClass(), "totalAwake", -1798428742);
        setIntField(term150319, term150319.getClass(), "gradeRating", 204314649);
        setIntField(term150319, term150319.getClass(), "musicRating", 758889924);
        setIntField(term150319, term150319.getClass(), "playerRating", -579422575);
        setIntField(term150319, term150319.getClass(), "highestRating", 223876386);
        setIntField(term150319, term150319.getClass(), "gradeRank", 87499307);
        setIntField(term150319, term150319.getClass(), "classRank", 762125008);
        setIntField(term150319, term150319.getClass(), "courseRank", -828578391);
        setField(term150319, term150319.getClass(), "charaSlot", term150384);
        setField(term150319, term150319.getClass(), "charaLockSlot", term150396);
        setLongField(term150319, term150319.getClass(), "contentBit", 1781998247572062436L);
        setIntField(term150319, term150319.getClass(), "playCount", 1227082809);
        setField(term150319, term150319.getClass(), "eventWatchedDate", "qEwUfGEixD");
        setField(term150319, term150319.getClass(), "lastGameId", "gzwdEqELlU");
        setField(term150319, term150319.getClass(), "lastRomVersion", "PVcLgfdPEf");
        setField(term150319, term150319.getClass(), "lastDataVersion", "PEDTNvvicf");
        setField(term150319, term150319.getClass(), "lastLoginDate", "CoEwWlFbOr");
        setField(term150319, term150319.getClass(), "lastPlayDate", "oKzUOrAFFo");
        setIntField(term150319, term150319.getClass(), "lastPlayCredit", -830464254);
        setIntField(term150319, term150319.getClass(), "lastPlayMode", -1633113382);
        setIntField(term150319, term150319.getClass(), "lastPlaceId", 1665043120);
        setField(term150319, term150319.getClass(), "lastPlaceName", "cShhTkvRUF");
        setIntField(term150319, term150319.getClass(), "lastAllNetId", -1816157328);
        setIntField(term150319, term150319.getClass(), "lastRegionId", -1918609852);
        setField(term150319, term150319.getClass(), "lastRegionName", "qgiseKtoqu");
        setField(term150319, term150319.getClass(), "lastClientId", "FfGmyAKSaB");
        setField(term150319, term150319.getClass(), "lastCountryCode", "icoPCGhgWH");
        setIntField(term150319, term150319.getClass(), "lastSelectEMoney", -1410223524);
        setIntField(term150319, term150319.getClass(), "lastSelectTicket", 1492158172);
        setIntField(term150319, term150319.getClass(), "lastSelectCourse", 705497880);
        setIntField(term150319, term150319.getClass(), "lastCountCourse", -540039355);
        setField(term150319, term150319.getClass(), "firstGameId", "CHQBuYSRSj");
        setField(term150319, term150319.getClass(), "firstRomVersion", "UyXrmrYEff");
        setField(term150319, term150319.getClass(), "firstDataVersion", "hKmKbZReWq");
        setField(term150319, term150319.getClass(), "firstPlayDate", "dVNQlaRjno");
        setField(term150319, term150319.getClass(), "compatibleCmVersion", "heuePoxaMW");
        setField(term150319, term150319.getClass(), "dailyBonusDate", "MxqYtTLyvM");
        setField(term150319, term150319.getClass(), "dailyCourseBonusDate", "FuAWIrUgQq");
        setField(term150319, term150319.getClass(), "lastPairLoginDate", "GMuFrECYuC");
        setField(term150319, term150319.getClass(), "lastTrialPlayDate", "sgrKLUdnej");
        setIntField(term150319, term150319.getClass(), "playVsCount", -319029519);
        setIntField(term150319, term150319.getClass(), "playSyncCount", 856050368);
        setIntField(term150319, term150319.getClass(), "winCount", 1929961324);
        setIntField(term150319, term150319.getClass(), "helpCount", 342396095);
        setIntField(term150319, term150319.getClass(), "comboCount", 352957175);
        setLongField(term150319, term150319.getClass(), "totalDeluxscore", -2382836773740532780L);
        setLongField(term150319, term150319.getClass(), "totalBasicDeluxscore", -5595950074159538455L);
        setLongField(term150319, term150319.getClass(), "totalAdvancedDeluxscore", 7607467881442373626L);
        setLongField(term150319, term150319.getClass(), "totalExpertDeluxscore", 2102078141615247474L);
        setLongField(term150319, term150319.getClass(), "totalMasterDeluxscore", 7974291532823867224L);
        setLongField(term150319, term150319.getClass(), "totalReMasterDeluxscore", 3399078239721653919L);
        setIntField(term150319, term150319.getClass(), "totalSync", -416881882);
        setIntField(term150319, term150319.getClass(), "totalBasicSync", 272127700);
        setIntField(term150319, term150319.getClass(), "totalAdvancedSync", -1473075262);
        setIntField(term150319, term150319.getClass(), "totalExpertSync", 443000686);
        setIntField(term150319, term150319.getClass(), "totalMasterSync", 1667596064);
        setIntField(term150319, term150319.getClass(), "totalReMasterSync", -251654040);
        setLongField(term150319, term150319.getClass(), "totalAchievement", 6445510143601694391L);
        setLongField(term150319, term150319.getClass(), "totalBasicAchievement", -6146165725203476105L);
        setLongField(term150319, term150319.getClass(), "totalAdvancedAchievement", -1175329795628679724L);
        setLongField(term150319, term150319.getClass(), "totalExpertAchievement", 3572209852876898315L);
        setLongField(term150319, term150319.getClass(), "totalMasterAchievement", -8065063026535203297L);
        setLongField(term150319, term150319.getClass(), "totalReMasterAchievement", -3856009678052679973L);
        setLongField(term150319, term150319.getClass(), "playerOldRating", -5251333726540697154L);
        setLongField(term150319, term150319.getClass(), "playerNewRating", -6489701860872030089L);
        setIntField(term150319, term150319.getClass(), "banState", -1843755543);
        setLongField(term150319, term150319.getClass(), "dateTime", -1643659052712681769L);
        setField(term150317, term150317.getClass(), "user", term150319);
        setIntField(term150317, term150317.getClass(), "selectMusicId", -852260826);
        setIntField(term150317, term150317.getClass(), "selectDifficultyId", -418135199);
        setIntField(term150317, term150317.getClass(), "categoryIndex", -998308174);
        setIntField(term150317, term150317.getClass(), "musicIndex", 943396558);
        setIntField(term150317, term150317.getClass(), "extraFlag", -249229799);
        setIntField(term150317, term150317.getClass(), "selectScoreType", 1410694856);
        setLongField(term150317, term150317.getClass(), "extendContentBit", 8845255719922252905L);
        setBooleanField(term150317, term150317.getClass(), "isPhotoAgree", true);
        setBooleanField(term150317, term150317.getClass(), "isGotoCodeRead", true);
        setBooleanField(term150317, term150317.getClass(), "selectResultDetails", false);
        setIntField(term150317, term150317.getClass(), "sortCategorySetting", -1629525320);
        setIntField(term150317, term150317.getClass(), "sortMusicSetting", -675248961);
        setField(term150317, term150317.getClass(), "selectedCardList", term150680);
        setField(term150317, term150317.getClass(), "encountMapNpcList", term150698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedCardList", argTypes, term150317, args);
    }

};


