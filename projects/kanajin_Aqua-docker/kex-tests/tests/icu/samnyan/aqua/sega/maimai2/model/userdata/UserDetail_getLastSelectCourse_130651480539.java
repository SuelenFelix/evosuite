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

public class UserDetail_getLastSelectCourse_130651480539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4251637;

    public UserDetail_getLastSelectCourse_130651480539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4251641 = new Long(-3528336609655788551L);
        ArrayList term4251702 = new ArrayList();
        Integer term4251708 = new Integer(-523694473);
        Integer term4251710 = new Integer(662814388);
        Integer term4251712 = new Integer(-988634792);
        Integer term4251714 = new Integer(-985800486);
        Integer term4251716 = new Integer(104926979);
        Integer term4251718 = new Integer(21442244);
        Integer term4251720 = new Integer(-644090733);
        Integer term4251722 = new Integer(1357265093);
        Integer term4251724 = new Integer(-383207990);
        ArrayList term4251706 = new ArrayList();
        ((ArrayList) term4251706).add(term4251708);
        ((ArrayList) term4251706).add(term4251710);
        ((ArrayList) term4251706).add(term4251712);
        ((ArrayList) term4251706).add(term4251714);
        ((ArrayList) term4251706).add(term4251716);
        ((ArrayList) term4251706).add(term4251718);
        ((ArrayList) term4251706).add(term4251720);
        ((ArrayList) term4251706).add(term4251722);
        ((ArrayList) term4251706).add(term4251724);
        term4251637 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4251639 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4251655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4251656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4251660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4251665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4251666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4251670 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4251637, term4251637.getClass(), "id", -8765076880643334368L);
        setLongField(term4251639, term4251639.getClass(), "id", -2431382831588526031L);
        setField(term4251639, term4251639.getClass(), "extId", term4251641);
        setField(term4251639, term4251639.getClass(), "luid", "YhSDoCztYE");
        setIntField(term4251656, term4251656.getClass(), "year", 2024);
        setShortField(term4251656, term4251656.getClass(), "month", (short) 2);
        setShortField(term4251656, term4251656.getClass(), "day", (short) 23);
        setField(term4251655, term4251655.getClass(), "date", term4251656);
        setByteField(term4251660, term4251660.getClass(), "hour", (byte) 9);
        setByteField(term4251660, term4251660.getClass(), "minute", (byte) 30);
        setByteField(term4251660, term4251660.getClass(), "second", (byte) 0);
        setIntField(term4251660, term4251660.getClass(), "nano", 615430791);
        setField(term4251655, term4251655.getClass(), "time", term4251660);
        setField(term4251639, term4251639.getClass(), "registerTime", term4251655);
        setIntField(term4251666, term4251666.getClass(), "year", 2029);
        setShortField(term4251666, term4251666.getClass(), "month", (short) 10);
        setShortField(term4251666, term4251666.getClass(), "day", (short) 3);
        setField(term4251665, term4251665.getClass(), "date", term4251666);
        setByteField(term4251670, term4251670.getClass(), "hour", (byte) 3);
        setByteField(term4251670, term4251670.getClass(), "minute", (byte) 40);
        setByteField(term4251670, term4251670.getClass(), "second", (byte) 11);
        setIntField(term4251670, term4251670.getClass(), "nano", 325455650);
        setField(term4251665, term4251665.getClass(), "time", term4251670);
        setField(term4251639, term4251639.getClass(), "accessTime", term4251665);
        setField(term4251637, term4251637.getClass(), "card", term4251639);
        setField(term4251637, term4251637.getClass(), "userName", "kXsMYZuuNE");
        setIntField(term4251637, term4251637.getClass(), "isNetMember", -384386268);
        setIntField(term4251637, term4251637.getClass(), "iconId", 2126487668);
        setIntField(term4251637, term4251637.getClass(), "plateId", -449377792);
        setIntField(term4251637, term4251637.getClass(), "titleId", 1384252172);
        setIntField(term4251637, term4251637.getClass(), "partnerId", -1352620818);
        setIntField(term4251637, term4251637.getClass(), "frameId", 1930137739);
        setIntField(term4251637, term4251637.getClass(), "selectMapId", -849081946);
        setIntField(term4251637, term4251637.getClass(), "totalAwake", -2137699042);
        setIntField(term4251637, term4251637.getClass(), "gradeRating", -1103880311);
        setIntField(term4251637, term4251637.getClass(), "musicRating", 535696673);
        setIntField(term4251637, term4251637.getClass(), "playerRating", 1415924431);
        setIntField(term4251637, term4251637.getClass(), "highestRating", 489280023);
        setIntField(term4251637, term4251637.getClass(), "gradeRank", -1233646261);
        setIntField(term4251637, term4251637.getClass(), "classRank", -1031023088);
        setIntField(term4251637, term4251637.getClass(), "courseRank", 789089096);
        setField(term4251637, term4251637.getClass(), "charaSlot", term4251702);
        setField(term4251637, term4251637.getClass(), "charaLockSlot", term4251706);
        setLongField(term4251637, term4251637.getClass(), "contentBit", -2713775394084153369L);
        setIntField(term4251637, term4251637.getClass(), "playCount", -913021587);
        setField(term4251637, term4251637.getClass(), "eventWatchedDate", "hdWhTgdJqH");
        setField(term4251637, term4251637.getClass(), "lastGameId", "FFDLAvPIkw");
        setField(term4251637, term4251637.getClass(), "lastRomVersion", "BJYqobeqqn");
        setField(term4251637, term4251637.getClass(), "lastDataVersion", "HabeXRxcbz");
        setField(term4251637, term4251637.getClass(), "lastLoginDate", "EFNABoLKQa");
        setField(term4251637, term4251637.getClass(), "lastPlayDate", "NmkNFVJmkk");
        setIntField(term4251637, term4251637.getClass(), "lastPlayCredit", 564707916);
        setIntField(term4251637, term4251637.getClass(), "lastPlayMode", -643056353);
        setIntField(term4251637, term4251637.getClass(), "lastPlaceId", 1854974157);
        setField(term4251637, term4251637.getClass(), "lastPlaceName", "MqQydWomKK");
        setIntField(term4251637, term4251637.getClass(), "lastAllNetId", -1482542127);
        setIntField(term4251637, term4251637.getClass(), "lastRegionId", -1543235308);
        setField(term4251637, term4251637.getClass(), "lastRegionName", "VYoqPJFRjX");
        setField(term4251637, term4251637.getClass(), "lastClientId", "lXBEpDsIlK");
        setField(term4251637, term4251637.getClass(), "lastCountryCode", "HuiKIWlzgl");
        setIntField(term4251637, term4251637.getClass(), "lastSelectEMoney", 1258651303);
        setIntField(term4251637, term4251637.getClass(), "lastSelectTicket", 555296482);
        setIntField(term4251637, term4251637.getClass(), "lastSelectCourse", 1168455279);
        setIntField(term4251637, term4251637.getClass(), "lastCountCourse", -401236331);
        setField(term4251637, term4251637.getClass(), "firstGameId", "bzqGabYllx");
        setField(term4251637, term4251637.getClass(), "firstRomVersion", "YfpBAhUUCe");
        setField(term4251637, term4251637.getClass(), "firstDataVersion", "aovgyvyLau");
        setField(term4251637, term4251637.getClass(), "firstPlayDate", "kkUHgZfSnT");
        setField(term4251637, term4251637.getClass(), "compatibleCmVersion", "iZyCgXrZoz");
        setField(term4251637, term4251637.getClass(), "dailyBonusDate", "VAfeaOUKQN");
        setField(term4251637, term4251637.getClass(), "dailyCourseBonusDate", "kXSyhJSvNg");
        setField(term4251637, term4251637.getClass(), "lastPairLoginDate", "QbrMwkSQBc");
        setField(term4251637, term4251637.getClass(), "lastTrialPlayDate", "pJCaIdXxCT");
        setIntField(term4251637, term4251637.getClass(), "playVsCount", -1168275335);
        setIntField(term4251637, term4251637.getClass(), "playSyncCount", 1934343650);
        setIntField(term4251637, term4251637.getClass(), "winCount", 1438520948);
        setIntField(term4251637, term4251637.getClass(), "helpCount", 1095043419);
        setIntField(term4251637, term4251637.getClass(), "comboCount", -1154057473);
        setLongField(term4251637, term4251637.getClass(), "totalDeluxscore", 6735563955879164646L);
        setLongField(term4251637, term4251637.getClass(), "totalBasicDeluxscore", 5944703669728531787L);
        setLongField(term4251637, term4251637.getClass(), "totalAdvancedDeluxscore", 6954770956926737203L);
        setLongField(term4251637, term4251637.getClass(), "totalExpertDeluxscore", -4333641901244188729L);
        setLongField(term4251637, term4251637.getClass(), "totalMasterDeluxscore", 8379417448757687423L);
        setLongField(term4251637, term4251637.getClass(), "totalReMasterDeluxscore", -7488262614200054152L);
        setIntField(term4251637, term4251637.getClass(), "totalSync", 821512023);
        setIntField(term4251637, term4251637.getClass(), "totalBasicSync", -1142799152);
        setIntField(term4251637, term4251637.getClass(), "totalAdvancedSync", -25661439);
        setIntField(term4251637, term4251637.getClass(), "totalExpertSync", -2017554272);
        setIntField(term4251637, term4251637.getClass(), "totalMasterSync", -80176244);
        setIntField(term4251637, term4251637.getClass(), "totalReMasterSync", -255505860);
        setLongField(term4251637, term4251637.getClass(), "totalAchievement", -5123582095592690159L);
        setLongField(term4251637, term4251637.getClass(), "totalBasicAchievement", -1706205838054345433L);
        setLongField(term4251637, term4251637.getClass(), "totalAdvancedAchievement", -3501054982984895823L);
        setLongField(term4251637, term4251637.getClass(), "totalExpertAchievement", 763910372664888967L);
        setLongField(term4251637, term4251637.getClass(), "totalMasterAchievement", -3713340348439593329L);
        setLongField(term4251637, term4251637.getClass(), "totalReMasterAchievement", 3214974698458848954L);
        setLongField(term4251637, term4251637.getClass(), "playerOldRating", -3388699557739960476L);
        setLongField(term4251637, term4251637.getClass(), "playerNewRating", -6288108046885647847L);
        setIntField(term4251637, term4251637.getClass(), "banState", 1627321062);
        setLongField(term4251637, term4251637.getClass(), "dateTime", -7679880099146415401L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectCourse", argTypes, term4251637, args);
    }

};


