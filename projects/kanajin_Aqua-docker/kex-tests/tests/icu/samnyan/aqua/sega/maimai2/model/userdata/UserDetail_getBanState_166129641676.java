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

public class UserDetail_getBanState_166129641676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238032;

    public UserDetail_getBanState_166129641676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238036 = new Long(8010417010297313651L);
        Integer term238099 = new Integer(909183017);
        ArrayList term238097 = new ArrayList();
        ((ArrayList) term238097).add(term238099);
        Integer term238105 = new Integer(-2115858923);
        Integer term238107 = new Integer(1709658376);
        Integer term238109 = new Integer(-1235730396);
        Integer term238111 = new Integer(-366600678);
        Integer term238113 = new Integer(-1641994868);
        Integer term238115 = new Integer(1729072481);
        Integer term238117 = new Integer(-1281635786);
        Integer term238119 = new Integer(1768552438);
        ArrayList term238103 = new ArrayList();
        ((ArrayList) term238103).add(term238105);
        ((ArrayList) term238103).add(term238107);
        ((ArrayList) term238103).add(term238109);
        ((ArrayList) term238103).add(term238111);
        ((ArrayList) term238103).add(term238113);
        ((ArrayList) term238103).add(term238115);
        ((ArrayList) term238103).add(term238117);
        ((ArrayList) term238103).add(term238119);
        term238032 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term238034 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term238050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term238060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term238061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term238065 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term238032, term238032.getClass(), "id", 7741646591388121594L);
        setLongField(term238034, term238034.getClass(), "id", -2594352270951496749L);
        setField(term238034, term238034.getClass(), "extId", term238036);
        setField(term238034, term238034.getClass(), "luid", "CzDfpcxVwI");
        setIntField(term238051, term238051.getClass(), "year", 2025);
        setShortField(term238051, term238051.getClass(), "month", (short) 7);
        setShortField(term238051, term238051.getClass(), "day", (short) 22);
        setField(term238050, term238050.getClass(), "date", term238051);
        setByteField(term238055, term238055.getClass(), "hour", (byte) 19);
        setByteField(term238055, term238055.getClass(), "minute", (byte) 18);
        setByteField(term238055, term238055.getClass(), "second", (byte) 28);
        setIntField(term238055, term238055.getClass(), "nano", 975087142);
        setField(term238050, term238050.getClass(), "time", term238055);
        setField(term238034, term238034.getClass(), "registerTime", term238050);
        setIntField(term238061, term238061.getClass(), "year", 2018);
        setShortField(term238061, term238061.getClass(), "month", (short) 6);
        setShortField(term238061, term238061.getClass(), "day", (short) 29);
        setField(term238060, term238060.getClass(), "date", term238061);
        setByteField(term238065, term238065.getClass(), "hour", (byte) 0);
        setByteField(term238065, term238065.getClass(), "minute", (byte) 24);
        setByteField(term238065, term238065.getClass(), "second", (byte) 5);
        setIntField(term238065, term238065.getClass(), "nano", 130907665);
        setField(term238060, term238060.getClass(), "time", term238065);
        setField(term238034, term238034.getClass(), "accessTime", term238060);
        setField(term238032, term238032.getClass(), "card", term238034);
        setField(term238032, term238032.getClass(), "userName", "sUKfpEKBAS");
        setIntField(term238032, term238032.getClass(), "isNetMember", -1918459934);
        setIntField(term238032, term238032.getClass(), "iconId", -1518816079);
        setIntField(term238032, term238032.getClass(), "plateId", -1959564399);
        setIntField(term238032, term238032.getClass(), "titleId", 789264413);
        setIntField(term238032, term238032.getClass(), "partnerId", 1411543119);
        setIntField(term238032, term238032.getClass(), "frameId", 21102667);
        setIntField(term238032, term238032.getClass(), "selectMapId", -1730684267);
        setIntField(term238032, term238032.getClass(), "totalAwake", -291152891);
        setIntField(term238032, term238032.getClass(), "gradeRating", 527391816);
        setIntField(term238032, term238032.getClass(), "musicRating", 407142365);
        setIntField(term238032, term238032.getClass(), "playerRating", -303557577);
        setIntField(term238032, term238032.getClass(), "highestRating", -24241468);
        setIntField(term238032, term238032.getClass(), "gradeRank", 1648187712);
        setIntField(term238032, term238032.getClass(), "classRank", -1643165362);
        setIntField(term238032, term238032.getClass(), "courseRank", 644721007);
        setField(term238032, term238032.getClass(), "charaSlot", term238097);
        setField(term238032, term238032.getClass(), "charaLockSlot", term238103);
        setLongField(term238032, term238032.getClass(), "contentBit", 4263846353104131296L);
        setIntField(term238032, term238032.getClass(), "playCount", -1061030332);
        setField(term238032, term238032.getClass(), "eventWatchedDate", "anfAMeVVsC");
        setField(term238032, term238032.getClass(), "lastGameId", "GlIWuwNnwL");
        setField(term238032, term238032.getClass(), "lastRomVersion", "HDsXonVTyY");
        setField(term238032, term238032.getClass(), "lastDataVersion", "BusZaRriAA");
        setField(term238032, term238032.getClass(), "lastLoginDate", "imlbrmsABR");
        setField(term238032, term238032.getClass(), "lastPlayDate", "VozwaeTzwB");
        setIntField(term238032, term238032.getClass(), "lastPlayCredit", 1719003803);
        setIntField(term238032, term238032.getClass(), "lastPlayMode", 1792293745);
        setIntField(term238032, term238032.getClass(), "lastPlaceId", 294713671);
        setField(term238032, term238032.getClass(), "lastPlaceName", "NzhnvXaHzq");
        setIntField(term238032, term238032.getClass(), "lastAllNetId", 1869812691);
        setIntField(term238032, term238032.getClass(), "lastRegionId", 1131021258);
        setField(term238032, term238032.getClass(), "lastRegionName", "JkfLtSQjWq");
        setField(term238032, term238032.getClass(), "lastClientId", "JpZUfTkpjW");
        setField(term238032, term238032.getClass(), "lastCountryCode", "SbMMeUExqe");
        setIntField(term238032, term238032.getClass(), "lastSelectEMoney", 1216297099);
        setIntField(term238032, term238032.getClass(), "lastSelectTicket", 1287631638);
        setIntField(term238032, term238032.getClass(), "lastSelectCourse", -447126454);
        setIntField(term238032, term238032.getClass(), "lastCountCourse", 1697871767);
        setField(term238032, term238032.getClass(), "firstGameId", "CKFhbAWYOu");
        setField(term238032, term238032.getClass(), "firstRomVersion", "cjASmDMJyf");
        setField(term238032, term238032.getClass(), "firstDataVersion", "ALbKTRphvX");
        setField(term238032, term238032.getClass(), "firstPlayDate", "vWbSXhWaUM");
        setField(term238032, term238032.getClass(), "compatibleCmVersion", "xGZegFGFwp");
        setField(term238032, term238032.getClass(), "dailyBonusDate", "mcyLkkYdqH");
        setField(term238032, term238032.getClass(), "dailyCourseBonusDate", "NgPHLrUVTl");
        setField(term238032, term238032.getClass(), "lastPairLoginDate", "cGSjeMMyEG");
        setField(term238032, term238032.getClass(), "lastTrialPlayDate", "zDxtwCfvRN");
        setIntField(term238032, term238032.getClass(), "playVsCount", -1700264686);
        setIntField(term238032, term238032.getClass(), "playSyncCount", 1753008116);
        setIntField(term238032, term238032.getClass(), "winCount", 1276815986);
        setIntField(term238032, term238032.getClass(), "helpCount", -521303871);
        setIntField(term238032, term238032.getClass(), "comboCount", -1392718153);
        setLongField(term238032, term238032.getClass(), "totalDeluxscore", 4269601655699880663L);
        setLongField(term238032, term238032.getClass(), "totalBasicDeluxscore", 9033590544636648348L);
        setLongField(term238032, term238032.getClass(), "totalAdvancedDeluxscore", 7635030261214995387L);
        setLongField(term238032, term238032.getClass(), "totalExpertDeluxscore", 1936080764887985376L);
        setLongField(term238032, term238032.getClass(), "totalMasterDeluxscore", 4926815456683112972L);
        setLongField(term238032, term238032.getClass(), "totalReMasterDeluxscore", -7395483518509710498L);
        setIntField(term238032, term238032.getClass(), "totalSync", -256278679);
        setIntField(term238032, term238032.getClass(), "totalBasicSync", -524155996);
        setIntField(term238032, term238032.getClass(), "totalAdvancedSync", -1349685301);
        setIntField(term238032, term238032.getClass(), "totalExpertSync", -2128633946);
        setIntField(term238032, term238032.getClass(), "totalMasterSync", 1147052903);
        setIntField(term238032, term238032.getClass(), "totalReMasterSync", 328521391);
        setLongField(term238032, term238032.getClass(), "totalAchievement", -7944848809682738791L);
        setLongField(term238032, term238032.getClass(), "totalBasicAchievement", 2420176577964050902L);
        setLongField(term238032, term238032.getClass(), "totalAdvancedAchievement", 4130720357611521038L);
        setLongField(term238032, term238032.getClass(), "totalExpertAchievement", 5857668486465858383L);
        setLongField(term238032, term238032.getClass(), "totalMasterAchievement", 628820741062223072L);
        setLongField(term238032, term238032.getClass(), "totalReMasterAchievement", 5897862370785158052L);
        setLongField(term238032, term238032.getClass(), "playerOldRating", -5597177338252488848L);
        setLongField(term238032, term238032.getClass(), "playerNewRating", 917705180049298498L);
        setIntField(term238032, term238032.getClass(), "banState", 2086464016);
        setLongField(term238032, term238032.getClass(), "dateTime", 8038992748503712618L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBanState", argTypes, term238032, args);
    }

};


