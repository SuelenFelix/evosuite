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

public class UserUdemae_getMaxWinNum_11091032429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99596;

    public UserUdemae_getMaxWinNum_11091032429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99602 = new Long(-7278883608542636188L);
        Integer term99665 = new Integer(694100722);
        Integer term99667 = new Integer(-680529431);
        Integer term99669 = new Integer(212698793);
        Integer term99671 = new Integer(1169519385);
        ArrayList term99663 = new ArrayList();
        ((ArrayList) term99663).add(term99665);
        ((ArrayList) term99663).add(term99667);
        ((ArrayList) term99663).add(term99669);
        ((ArrayList) term99663).add(term99671);
        Integer term99677 = new Integer(1846078344);
        Integer term99679 = new Integer(1692543802);
        Integer term99681 = new Integer(376341151);
        Integer term99683 = new Integer(-1607267243);
        Integer term99685 = new Integer(1641377218);
        Integer term99687 = new Integer(1235375204);
        Integer term99689 = new Integer(258334639);
        Integer term99691 = new Integer(1432187207);
        Integer term99693 = new Integer(-91068927);
        ArrayList term99675 = new ArrayList();
        ((ArrayList) term99675).add(term99677);
        ((ArrayList) term99675).add(term99679);
        ((ArrayList) term99675).add(term99681);
        ((ArrayList) term99675).add(term99683);
        ((ArrayList) term99675).add(term99685);
        ((ArrayList) term99675).add(term99687);
        ((ArrayList) term99675).add(term99689);
        ((ArrayList) term99675).add(term99691);
        ((ArrayList) term99675).add(term99693);
        term99596 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term99598 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term99600 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99631 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99596, term99596.getClass(), "id", 7247674325364556051L);
        setLongField(term99598, term99598.getClass(), "id", 329075143180309928L);
        setLongField(term99600, term99600.getClass(), "id", -8203373005676064618L);
        setField(term99600, term99600.getClass(), "extId", term99602);
        setField(term99600, term99600.getClass(), "luid", "zomtOAIouP");
        setIntField(term99617, term99617.getClass(), "year", 2016);
        setShortField(term99617, term99617.getClass(), "month", (short) 10);
        setShortField(term99617, term99617.getClass(), "day", (short) 12);
        setField(term99616, term99616.getClass(), "date", term99617);
        setByteField(term99621, term99621.getClass(), "hour", (byte) 11);
        setByteField(term99621, term99621.getClass(), "minute", (byte) 25);
        setByteField(term99621, term99621.getClass(), "second", (byte) 37);
        setIntField(term99621, term99621.getClass(), "nano", 215113477);
        setField(term99616, term99616.getClass(), "time", term99621);
        setField(term99600, term99600.getClass(), "registerTime", term99616);
        setIntField(term99627, term99627.getClass(), "year", 2012);
        setShortField(term99627, term99627.getClass(), "month", (short) 12);
        setShortField(term99627, term99627.getClass(), "day", (short) 10);
        setField(term99626, term99626.getClass(), "date", term99627);
        setByteField(term99631, term99631.getClass(), "hour", (byte) 6);
        setByteField(term99631, term99631.getClass(), "minute", (byte) 26);
        setByteField(term99631, term99631.getClass(), "second", (byte) 38);
        setIntField(term99631, term99631.getClass(), "nano", 934336730);
        setField(term99626, term99626.getClass(), "time", term99631);
        setField(term99600, term99600.getClass(), "accessTime", term99626);
        setField(term99598, term99598.getClass(), "card", term99600);
        setField(term99598, term99598.getClass(), "userName", "pwHkUmkBGN");
        setIntField(term99598, term99598.getClass(), "isNetMember", -977176926);
        setIntField(term99598, term99598.getClass(), "iconId", 57300217);
        setIntField(term99598, term99598.getClass(), "plateId", -296773597);
        setIntField(term99598, term99598.getClass(), "titleId", 1865713857);
        setIntField(term99598, term99598.getClass(), "partnerId", 1621042327);
        setIntField(term99598, term99598.getClass(), "frameId", -1687833420);
        setIntField(term99598, term99598.getClass(), "selectMapId", -1302564054);
        setIntField(term99598, term99598.getClass(), "totalAwake", 1902301591);
        setIntField(term99598, term99598.getClass(), "gradeRating", 1413243835);
        setIntField(term99598, term99598.getClass(), "musicRating", 267793727);
        setIntField(term99598, term99598.getClass(), "playerRating", 824213114);
        setIntField(term99598, term99598.getClass(), "highestRating", -1652054445);
        setIntField(term99598, term99598.getClass(), "gradeRank", -2032148548);
        setIntField(term99598, term99598.getClass(), "classRank", 1592642995);
        setIntField(term99598, term99598.getClass(), "courseRank", 537031810);
        setField(term99598, term99598.getClass(), "charaSlot", term99663);
        setField(term99598, term99598.getClass(), "charaLockSlot", term99675);
        setLongField(term99598, term99598.getClass(), "contentBit", -2387931839279962287L);
        setIntField(term99598, term99598.getClass(), "playCount", -1280322093);
        setField(term99598, term99598.getClass(), "eventWatchedDate", "TZJzEpeSDz");
        setField(term99598, term99598.getClass(), "lastGameId", "CEVnfPOBDk");
        setField(term99598, term99598.getClass(), "lastRomVersion", "JUpDTRXGtv");
        setField(term99598, term99598.getClass(), "lastDataVersion", "cKBnwzMCia");
        setField(term99598, term99598.getClass(), "lastLoginDate", "QWmZpWASOK");
        setField(term99598, term99598.getClass(), "lastPlayDate", "ZNLWGsxniS");
        setIntField(term99598, term99598.getClass(), "lastPlayCredit", -614078903);
        setIntField(term99598, term99598.getClass(), "lastPlayMode", 250967452);
        setIntField(term99598, term99598.getClass(), "lastPlaceId", -67856100);
        setField(term99598, term99598.getClass(), "lastPlaceName", "JARLxkvqNB");
        setIntField(term99598, term99598.getClass(), "lastAllNetId", -1760300151);
        setIntField(term99598, term99598.getClass(), "lastRegionId", 635198715);
        setField(term99598, term99598.getClass(), "lastRegionName", "tNcVErsFVe");
        setField(term99598, term99598.getClass(), "lastClientId", "DnCwTIIzcH");
        setField(term99598, term99598.getClass(), "lastCountryCode", "ULOSEQkLaZ");
        setIntField(term99598, term99598.getClass(), "lastSelectEMoney", -619729133);
        setIntField(term99598, term99598.getClass(), "lastSelectTicket", -91784171);
        setIntField(term99598, term99598.getClass(), "lastSelectCourse", -1752710731);
        setIntField(term99598, term99598.getClass(), "lastCountCourse", -1991397007);
        setField(term99598, term99598.getClass(), "firstGameId", "frsRnTwGAg");
        setField(term99598, term99598.getClass(), "firstRomVersion", "mLdICgTzLU");
        setField(term99598, term99598.getClass(), "firstDataVersion", "MgDkHuQnRs");
        setField(term99598, term99598.getClass(), "firstPlayDate", "iEeRhESASl");
        setField(term99598, term99598.getClass(), "compatibleCmVersion", "eywpqasaKj");
        setField(term99598, term99598.getClass(), "dailyBonusDate", "QnaLMKXAzJ");
        setField(term99598, term99598.getClass(), "dailyCourseBonusDate", "QrHmFoeUoY");
        setField(term99598, term99598.getClass(), "lastPairLoginDate", "BIysFVoAAl");
        setField(term99598, term99598.getClass(), "lastTrialPlayDate", "TAqcGSOgIz");
        setIntField(term99598, term99598.getClass(), "playVsCount", -1896800756);
        setIntField(term99598, term99598.getClass(), "playSyncCount", -855121939);
        setIntField(term99598, term99598.getClass(), "winCount", 389647062);
        setIntField(term99598, term99598.getClass(), "helpCount", 59254717);
        setIntField(term99598, term99598.getClass(), "comboCount", -1753562901);
        setLongField(term99598, term99598.getClass(), "totalDeluxscore", -781213565213959299L);
        setLongField(term99598, term99598.getClass(), "totalBasicDeluxscore", 1627503725336812835L);
        setLongField(term99598, term99598.getClass(), "totalAdvancedDeluxscore", -6399585202609591962L);
        setLongField(term99598, term99598.getClass(), "totalExpertDeluxscore", -7548100222716923684L);
        setLongField(term99598, term99598.getClass(), "totalMasterDeluxscore", -862074792274450196L);
        setLongField(term99598, term99598.getClass(), "totalReMasterDeluxscore", 1942144735337962969L);
        setIntField(term99598, term99598.getClass(), "totalSync", 1942866138);
        setIntField(term99598, term99598.getClass(), "totalBasicSync", -628548003);
        setIntField(term99598, term99598.getClass(), "totalAdvancedSync", -1600050434);
        setIntField(term99598, term99598.getClass(), "totalExpertSync", 2068225629);
        setIntField(term99598, term99598.getClass(), "totalMasterSync", 230619154);
        setIntField(term99598, term99598.getClass(), "totalReMasterSync", 939877540);
        setLongField(term99598, term99598.getClass(), "totalAchievement", -4344753984954632336L);
        setLongField(term99598, term99598.getClass(), "totalBasicAchievement", 4631827794948700273L);
        setLongField(term99598, term99598.getClass(), "totalAdvancedAchievement", 6813589793299718428L);
        setLongField(term99598, term99598.getClass(), "totalExpertAchievement", 6539225967589742494L);
        setLongField(term99598, term99598.getClass(), "totalMasterAchievement", -5299004755000484571L);
        setLongField(term99598, term99598.getClass(), "totalReMasterAchievement", -1308506010473990942L);
        setLongField(term99598, term99598.getClass(), "playerOldRating", -665107459568416177L);
        setLongField(term99598, term99598.getClass(), "playerNewRating", 3591499275146847847L);
        setIntField(term99598, term99598.getClass(), "banState", -1177910195);
        setLongField(term99598, term99598.getClass(), "dateTime", -5231606455063875658L);
        setField(term99596, term99596.getClass(), "user", term99598);
        setIntField(term99596, term99596.getClass(), "rate", 2096168037);
        setIntField(term99596, term99596.getClass(), "maxRate", -681093302);
        setIntField(term99596, term99596.getClass(), "classValue", 1008385565);
        setIntField(term99596, term99596.getClass(), "maxClassValue", -1408656420);
        setIntField(term99596, term99596.getClass(), "totalWinNum", 1356166325);
        setIntField(term99596, term99596.getClass(), "totalLoseNum", 36575353);
        setIntField(term99596, term99596.getClass(), "maxWinNum", 1173070286);
        setIntField(term99596, term99596.getClass(), "maxLoseNum", -373348260);
        setIntField(term99596, term99596.getClass(), "winNum", -476546497);
        setIntField(term99596, term99596.getClass(), "loseNum", 1196854753);
        setIntField(term99596, term99596.getClass(), "npcTotalWinNum", -59756804);
        setIntField(term99596, term99596.getClass(), "npcTotalLoseNum", 535818399);
        setIntField(term99596, term99596.getClass(), "npcMaxWinNum", 1397433354);
        setIntField(term99596, term99596.getClass(), "npcMaxLoseNum", -135791025);
        setIntField(term99596, term99596.getClass(), "npcWinNum", 59811366);
        setIntField(term99596, term99596.getClass(), "npcLoseNum", 874873727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxWinNum", argTypes, term99596, args);
    }

};


