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

public class UserMap_toString_4377418218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584189;

    public UserMap_toString_4377418218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term584195 = new Long(-4526944004625263747L);
        ArrayList term584256 = new ArrayList();
        Integer term584262 = new Integer(-766372661);
        ArrayList term584260 = new ArrayList();
        ((ArrayList) term584260).add(term584262);
        term584189 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term584191 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term584193 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term584209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term584210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term584214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term584219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term584220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term584224 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term584189, term584189.getClass(), "id", 7127942466197175127L);
        setLongField(term584191, term584191.getClass(), "id", 2199091496632615028L);
        setLongField(term584193, term584193.getClass(), "id", -3434577121304547875L);
        setField(term584193, term584193.getClass(), "extId", term584195);
        setField(term584193, term584193.getClass(), "luid", "ICqDhBVbPv");
        setIntField(term584210, term584210.getClass(), "year", 2019);
        setShortField(term584210, term584210.getClass(), "month", (short) 5);
        setShortField(term584210, term584210.getClass(), "day", (short) 3);
        setField(term584209, term584209.getClass(), "date", term584210);
        setByteField(term584214, term584214.getClass(), "hour", (byte) 6);
        setByteField(term584214, term584214.getClass(), "minute", (byte) 33);
        setByteField(term584214, term584214.getClass(), "second", (byte) 39);
        setIntField(term584214, term584214.getClass(), "nano", 961769504);
        setField(term584209, term584209.getClass(), "time", term584214);
        setField(term584193, term584193.getClass(), "registerTime", term584209);
        setIntField(term584220, term584220.getClass(), "year", 2016);
        setShortField(term584220, term584220.getClass(), "month", (short) 9);
        setShortField(term584220, term584220.getClass(), "day", (short) 25);
        setField(term584219, term584219.getClass(), "date", term584220);
        setByteField(term584224, term584224.getClass(), "hour", (byte) 21);
        setByteField(term584224, term584224.getClass(), "minute", (byte) 13);
        setByteField(term584224, term584224.getClass(), "second", (byte) 45);
        setIntField(term584224, term584224.getClass(), "nano", 346006281);
        setField(term584219, term584219.getClass(), "time", term584224);
        setField(term584193, term584193.getClass(), "accessTime", term584219);
        setField(term584191, term584191.getClass(), "card", term584193);
        setField(term584191, term584191.getClass(), "userName", "wxSJuYLUSo");
        setIntField(term584191, term584191.getClass(), "isNetMember", 1249390093);
        setIntField(term584191, term584191.getClass(), "iconId", 1781352597);
        setIntField(term584191, term584191.getClass(), "plateId", -1464419273);
        setIntField(term584191, term584191.getClass(), "titleId", 101437493);
        setIntField(term584191, term584191.getClass(), "partnerId", 612412828);
        setIntField(term584191, term584191.getClass(), "frameId", 347393416);
        setIntField(term584191, term584191.getClass(), "selectMapId", -866857422);
        setIntField(term584191, term584191.getClass(), "totalAwake", 1368305038);
        setIntField(term584191, term584191.getClass(), "gradeRating", 322638434);
        setIntField(term584191, term584191.getClass(), "musicRating", 457114575);
        setIntField(term584191, term584191.getClass(), "playerRating", -454493659);
        setIntField(term584191, term584191.getClass(), "highestRating", -1785390132);
        setIntField(term584191, term584191.getClass(), "gradeRank", 387545717);
        setIntField(term584191, term584191.getClass(), "classRank", 1510598452);
        setIntField(term584191, term584191.getClass(), "courseRank", -1725563315);
        setField(term584191, term584191.getClass(), "charaSlot", term584256);
        setField(term584191, term584191.getClass(), "charaLockSlot", term584260);
        setLongField(term584191, term584191.getClass(), "contentBit", 9008106867910522170L);
        setIntField(term584191, term584191.getClass(), "playCount", -1736256370);
        setField(term584191, term584191.getClass(), "eventWatchedDate", "AKnlhjRZfT");
        setField(term584191, term584191.getClass(), "lastGameId", "bnPwbrkAWy");
        setField(term584191, term584191.getClass(), "lastRomVersion", "qSNiDyZvUs");
        setField(term584191, term584191.getClass(), "lastDataVersion", "ugjpIZRgPz");
        setField(term584191, term584191.getClass(), "lastLoginDate", "jYVrbrmINc");
        setField(term584191, term584191.getClass(), "lastPlayDate", "oTfjVNLZjM");
        setIntField(term584191, term584191.getClass(), "lastPlayCredit", -753015351);
        setIntField(term584191, term584191.getClass(), "lastPlayMode", 2130339383);
        setIntField(term584191, term584191.getClass(), "lastPlaceId", 529326378);
        setField(term584191, term584191.getClass(), "lastPlaceName", "XziYPzlVQZ");
        setIntField(term584191, term584191.getClass(), "lastAllNetId", 1682450405);
        setIntField(term584191, term584191.getClass(), "lastRegionId", -2056229179);
        setField(term584191, term584191.getClass(), "lastRegionName", "mlIZUrrzgf");
        setField(term584191, term584191.getClass(), "lastClientId", "FJwaGtFfjp");
        setField(term584191, term584191.getClass(), "lastCountryCode", "jEBAHrIzQI");
        setIntField(term584191, term584191.getClass(), "lastSelectEMoney", 1490514193);
        setIntField(term584191, term584191.getClass(), "lastSelectTicket", 1505750573);
        setIntField(term584191, term584191.getClass(), "lastSelectCourse", -2051977998);
        setIntField(term584191, term584191.getClass(), "lastCountCourse", -842532845);
        setField(term584191, term584191.getClass(), "firstGameId", "fOLwwCSUUC");
        setField(term584191, term584191.getClass(), "firstRomVersion", "ZAouhfhEYk");
        setField(term584191, term584191.getClass(), "firstDataVersion", "qLJDuPIqSm");
        setField(term584191, term584191.getClass(), "firstPlayDate", "bsVRuDNaZu");
        setField(term584191, term584191.getClass(), "compatibleCmVersion", "VOIKSkiHvd");
        setField(term584191, term584191.getClass(), "dailyBonusDate", "HTOfdCkofg");
        setField(term584191, term584191.getClass(), "dailyCourseBonusDate", "JNNYacTPAj");
        setField(term584191, term584191.getClass(), "lastPairLoginDate", "oyKGSNbzBo");
        setField(term584191, term584191.getClass(), "lastTrialPlayDate", "ZrWkmVsTFk");
        setIntField(term584191, term584191.getClass(), "playVsCount", 1970828533);
        setIntField(term584191, term584191.getClass(), "playSyncCount", -1950594641);
        setIntField(term584191, term584191.getClass(), "winCount", -943220530);
        setIntField(term584191, term584191.getClass(), "helpCount", 525296567);
        setIntField(term584191, term584191.getClass(), "comboCount", -1370896488);
        setLongField(term584191, term584191.getClass(), "totalDeluxscore", -1468608523819602421L);
        setLongField(term584191, term584191.getClass(), "totalBasicDeluxscore", -7828458317023694852L);
        setLongField(term584191, term584191.getClass(), "totalAdvancedDeluxscore", -5307569499855827300L);
        setLongField(term584191, term584191.getClass(), "totalExpertDeluxscore", -2972012512125476051L);
        setLongField(term584191, term584191.getClass(), "totalMasterDeluxscore", 5168952470297249125L);
        setLongField(term584191, term584191.getClass(), "totalReMasterDeluxscore", 8037243066216809047L);
        setIntField(term584191, term584191.getClass(), "totalSync", -1098624987);
        setIntField(term584191, term584191.getClass(), "totalBasicSync", 601145257);
        setIntField(term584191, term584191.getClass(), "totalAdvancedSync", 599697251);
        setIntField(term584191, term584191.getClass(), "totalExpertSync", 2007877363);
        setIntField(term584191, term584191.getClass(), "totalMasterSync", 263468178);
        setIntField(term584191, term584191.getClass(), "totalReMasterSync", -722041803);
        setLongField(term584191, term584191.getClass(), "totalAchievement", 6552025595046074590L);
        setLongField(term584191, term584191.getClass(), "totalBasicAchievement", -7638781670300494530L);
        setLongField(term584191, term584191.getClass(), "totalAdvancedAchievement", 8350779321272197600L);
        setLongField(term584191, term584191.getClass(), "totalExpertAchievement", 6626364365753850182L);
        setLongField(term584191, term584191.getClass(), "totalMasterAchievement", -7988358166547126864L);
        setLongField(term584191, term584191.getClass(), "totalReMasterAchievement", -5672748460423228143L);
        setLongField(term584191, term584191.getClass(), "playerOldRating", 539327034078235707L);
        setLongField(term584191, term584191.getClass(), "playerNewRating", -3666331792308714900L);
        setIntField(term584191, term584191.getClass(), "banState", 687886856);
        setLongField(term584191, term584191.getClass(), "dateTime", 2318024833686419107L);
        setField(term584189, term584189.getClass(), "user", term584191);
        setIntField(term584189, term584189.getClass(), "mapId", -1024872121);
        setIntField(term584189, term584189.getClass(), "distance", 1226674748);
        setBooleanField(term584189, term584189.getClass(), "isLock", true);
        setBooleanField(term584189, term584189.getClass(), "isClear", true);
        setBooleanField(term584189, term584189.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term584189, args);
    }

};


