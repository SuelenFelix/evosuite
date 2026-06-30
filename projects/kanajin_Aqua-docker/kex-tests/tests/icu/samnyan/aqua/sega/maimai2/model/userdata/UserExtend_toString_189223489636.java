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

public class UserExtend_toString_189223489636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163997;

    public UserExtend_toString_189223489636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164003 = new Long(-593735869267672817L);
        Integer term164066 = new Integer(1813573586);
        Integer term164068 = new Integer(-1950105121);
        Integer term164070 = new Integer(1664370474);
        Integer term164072 = new Integer(56756754);
        Integer term164074 = new Integer(-1283242129);
        Integer term164076 = new Integer(-1400827537);
        ArrayList term164064 = new ArrayList();
        ((ArrayList) term164064).add(term164066);
        ((ArrayList) term164064).add(term164068);
        ((ArrayList) term164064).add(term164070);
        ((ArrayList) term164064).add(term164072);
        ((ArrayList) term164064).add(term164074);
        ((ArrayList) term164064).add(term164076);
        Integer term164082 = new Integer(1630959866);
        ArrayList term164080 = new ArrayList();
        ((ArrayList) term164080).add(term164082);
        Integer term164366 = new Integer(414147550);
        Integer term164368 = new Integer(1652909222);
        Integer term164370 = new Integer(1130098561);
        Integer term164372 = new Integer(954169543);
        Integer term164374 = new Integer(-2124307939);
        Integer term164376 = new Integer(332880714);
        ArrayList term164364 = new ArrayList();
        ((ArrayList) term164364).add(term164366);
        ((ArrayList) term164364).add(term164368);
        ((ArrayList) term164364).add(term164370);
        ((ArrayList) term164364).add(term164372);
        ((ArrayList) term164364).add(term164374);
        ((ArrayList) term164364).add(term164376);
        ArrayList term164380 = new ArrayList();
        term163997 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term163999 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term164001 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164032 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163997, term163997.getClass(), "id", 3544880174466994593L);
        setLongField(term163999, term163999.getClass(), "id", 8501384228243884494L);
        setLongField(term164001, term164001.getClass(), "id", 5988506569855641186L);
        setField(term164001, term164001.getClass(), "extId", term164003);
        setField(term164001, term164001.getClass(), "luid", "qpyqWqBXuI");
        setIntField(term164018, term164018.getClass(), "year", 2022);
        setShortField(term164018, term164018.getClass(), "month", (short) 5);
        setShortField(term164018, term164018.getClass(), "day", (short) 26);
        setField(term164017, term164017.getClass(), "date", term164018);
        setByteField(term164022, term164022.getClass(), "hour", (byte) 16);
        setByteField(term164022, term164022.getClass(), "minute", (byte) 7);
        setByteField(term164022, term164022.getClass(), "second", (byte) 6);
        setIntField(term164022, term164022.getClass(), "nano", 65239619);
        setField(term164017, term164017.getClass(), "time", term164022);
        setField(term164001, term164001.getClass(), "registerTime", term164017);
        setIntField(term164028, term164028.getClass(), "year", 2021);
        setShortField(term164028, term164028.getClass(), "month", (short) 4);
        setShortField(term164028, term164028.getClass(), "day", (short) 22);
        setField(term164027, term164027.getClass(), "date", term164028);
        setByteField(term164032, term164032.getClass(), "hour", (byte) 4);
        setByteField(term164032, term164032.getClass(), "minute", (byte) 51);
        setByteField(term164032, term164032.getClass(), "second", (byte) 42);
        setIntField(term164032, term164032.getClass(), "nano", 408430084);
        setField(term164027, term164027.getClass(), "time", term164032);
        setField(term164001, term164001.getClass(), "accessTime", term164027);
        setField(term163999, term163999.getClass(), "card", term164001);
        setField(term163999, term163999.getClass(), "userName", "VmcHOGdUdL");
        setIntField(term163999, term163999.getClass(), "isNetMember", 2134864696);
        setIntField(term163999, term163999.getClass(), "iconId", -518554287);
        setIntField(term163999, term163999.getClass(), "plateId", 123727036);
        setIntField(term163999, term163999.getClass(), "titleId", 1780326204);
        setIntField(term163999, term163999.getClass(), "partnerId", -1863902998);
        setIntField(term163999, term163999.getClass(), "frameId", -250348280);
        setIntField(term163999, term163999.getClass(), "selectMapId", -562854876);
        setIntField(term163999, term163999.getClass(), "totalAwake", -550640214);
        setIntField(term163999, term163999.getClass(), "gradeRating", 221003516);
        setIntField(term163999, term163999.getClass(), "musicRating", 694042457);
        setIntField(term163999, term163999.getClass(), "playerRating", 415234643);
        setIntField(term163999, term163999.getClass(), "highestRating", 1656688930);
        setIntField(term163999, term163999.getClass(), "gradeRank", -1343439629);
        setIntField(term163999, term163999.getClass(), "classRank", -1203456842);
        setIntField(term163999, term163999.getClass(), "courseRank", -638750860);
        setField(term163999, term163999.getClass(), "charaSlot", term164064);
        setField(term163999, term163999.getClass(), "charaLockSlot", term164080);
        setLongField(term163999, term163999.getClass(), "contentBit", -3313382521567902730L);
        setIntField(term163999, term163999.getClass(), "playCount", -1167375980);
        setField(term163999, term163999.getClass(), "eventWatchedDate", "jMjdEiZGZp");
        setField(term163999, term163999.getClass(), "lastGameId", "efxUIvyTyg");
        setField(term163999, term163999.getClass(), "lastRomVersion", "YJcfqsYvpK");
        setField(term163999, term163999.getClass(), "lastDataVersion", "DuTBCYJBrz");
        setField(term163999, term163999.getClass(), "lastLoginDate", "yztwwqDqge");
        setField(term163999, term163999.getClass(), "lastPlayDate", "orSUlVDZoM");
        setIntField(term163999, term163999.getClass(), "lastPlayCredit", 577436768);
        setIntField(term163999, term163999.getClass(), "lastPlayMode", 555961091);
        setIntField(term163999, term163999.getClass(), "lastPlaceId", -703576578);
        setField(term163999, term163999.getClass(), "lastPlaceName", "UwuTUXfZlO");
        setIntField(term163999, term163999.getClass(), "lastAllNetId", 206793849);
        setIntField(term163999, term163999.getClass(), "lastRegionId", 1243580461);
        setField(term163999, term163999.getClass(), "lastRegionName", "BuECvnjNNp");
        setField(term163999, term163999.getClass(), "lastClientId", "BjCrVrqCvg");
        setField(term163999, term163999.getClass(), "lastCountryCode", "yaNWgtVtAg");
        setIntField(term163999, term163999.getClass(), "lastSelectEMoney", 198372440);
        setIntField(term163999, term163999.getClass(), "lastSelectTicket", -1531562967);
        setIntField(term163999, term163999.getClass(), "lastSelectCourse", -1471282377);
        setIntField(term163999, term163999.getClass(), "lastCountCourse", -146555590);
        setField(term163999, term163999.getClass(), "firstGameId", "BbNOrjlUDe");
        setField(term163999, term163999.getClass(), "firstRomVersion", "tHYPJBuwZT");
        setField(term163999, term163999.getClass(), "firstDataVersion", "bvJdvzzEbX");
        setField(term163999, term163999.getClass(), "firstPlayDate", "qkbheFUdro");
        setField(term163999, term163999.getClass(), "compatibleCmVersion", "adnAJZpEzc");
        setField(term163999, term163999.getClass(), "dailyBonusDate", "ghmRSHgYWE");
        setField(term163999, term163999.getClass(), "dailyCourseBonusDate", "ldISIooOeQ");
        setField(term163999, term163999.getClass(), "lastPairLoginDate", "gnoGEIFddy");
        setField(term163999, term163999.getClass(), "lastTrialPlayDate", "BfiOcqELWK");
        setIntField(term163999, term163999.getClass(), "playVsCount", 1355523589);
        setIntField(term163999, term163999.getClass(), "playSyncCount", 170817693);
        setIntField(term163999, term163999.getClass(), "winCount", -923853879);
        setIntField(term163999, term163999.getClass(), "helpCount", 419328039);
        setIntField(term163999, term163999.getClass(), "comboCount", 76790742);
        setLongField(term163999, term163999.getClass(), "totalDeluxscore", 8230876269805518284L);
        setLongField(term163999, term163999.getClass(), "totalBasicDeluxscore", 2054507156946896983L);
        setLongField(term163999, term163999.getClass(), "totalAdvancedDeluxscore", -6651844343111330638L);
        setLongField(term163999, term163999.getClass(), "totalExpertDeluxscore", -5817879048746989326L);
        setLongField(term163999, term163999.getClass(), "totalMasterDeluxscore", 2228896102662979446L);
        setLongField(term163999, term163999.getClass(), "totalReMasterDeluxscore", -5214714474055061598L);
        setIntField(term163999, term163999.getClass(), "totalSync", 1540630124);
        setIntField(term163999, term163999.getClass(), "totalBasicSync", -1537736801);
        setIntField(term163999, term163999.getClass(), "totalAdvancedSync", -766206861);
        setIntField(term163999, term163999.getClass(), "totalExpertSync", 1576414103);
        setIntField(term163999, term163999.getClass(), "totalMasterSync", 891075650);
        setIntField(term163999, term163999.getClass(), "totalReMasterSync", 456541378);
        setLongField(term163999, term163999.getClass(), "totalAchievement", -7017519796291507029L);
        setLongField(term163999, term163999.getClass(), "totalBasicAchievement", 664732352318462812L);
        setLongField(term163999, term163999.getClass(), "totalAdvancedAchievement", 7557299615872134652L);
        setLongField(term163999, term163999.getClass(), "totalExpertAchievement", 4237129916833213880L);
        setLongField(term163999, term163999.getClass(), "totalMasterAchievement", -1957706870498645173L);
        setLongField(term163999, term163999.getClass(), "totalReMasterAchievement", 8428872930913184944L);
        setLongField(term163999, term163999.getClass(), "playerOldRating", -4723076625782479844L);
        setLongField(term163999, term163999.getClass(), "playerNewRating", 4642343821367966886L);
        setIntField(term163999, term163999.getClass(), "banState", -1836224314);
        setLongField(term163999, term163999.getClass(), "dateTime", -7521402482298985676L);
        setField(term163997, term163997.getClass(), "user", term163999);
        setIntField(term163997, term163997.getClass(), "selectMusicId", 824141018);
        setIntField(term163997, term163997.getClass(), "selectDifficultyId", 278690523);
        setIntField(term163997, term163997.getClass(), "categoryIndex", 272160059);
        setIntField(term163997, term163997.getClass(), "musicIndex", -19247990);
        setIntField(term163997, term163997.getClass(), "extraFlag", 1986476279);
        setIntField(term163997, term163997.getClass(), "selectScoreType", -715837772);
        setLongField(term163997, term163997.getClass(), "extendContentBit", 2486237442163013291L);
        setBooleanField(term163997, term163997.getClass(), "isPhotoAgree", false);
        setBooleanField(term163997, term163997.getClass(), "isGotoCodeRead", false);
        setBooleanField(term163997, term163997.getClass(), "selectResultDetails", false);
        setIntField(term163997, term163997.getClass(), "sortCategorySetting", 1707313333);
        setIntField(term163997, term163997.getClass(), "sortMusicSetting", 789086911);
        setField(term163997, term163997.getClass(), "selectedCardList", term164364);
        setField(term163997, term163997.getClass(), "encountMapNpcList", term164380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term163997, args);
    }

};


