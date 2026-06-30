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

public class UserCourse_getBestAchievement_70979035511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78055;

    public UserCourse_getBestAchievement_70979035511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78061 = new Long(6273754186658578034L);
        Integer term78124 = new Integer(-189738995);
        Integer term78126 = new Integer(1943019963);
        Integer term78128 = new Integer(186472650);
        Integer term78130 = new Integer(279675992);
        Integer term78132 = new Integer(-1626074989);
        Integer term78134 = new Integer(-552272253);
        ArrayList term78122 = new ArrayList();
        ((ArrayList) term78122).add(term78124);
        ((ArrayList) term78122).add(term78126);
        ((ArrayList) term78122).add(term78128);
        ((ArrayList) term78122).add(term78130);
        ((ArrayList) term78122).add(term78132);
        ((ArrayList) term78122).add(term78134);
        Integer term78140 = new Integer(-633523956);
        Integer term78142 = new Integer(1761540885);
        ArrayList term78138 = new ArrayList();
        ((ArrayList) term78138).add(term78140);
        ((ArrayList) term78138).add(term78142);
        term78055 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term78057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term78059 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78090 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78055, term78055.getClass(), "id", -79769691928375280L);
        setLongField(term78057, term78057.getClass(), "id", -1725922435876771176L);
        setLongField(term78059, term78059.getClass(), "id", 3612026645709034896L);
        setField(term78059, term78059.getClass(), "extId", term78061);
        setField(term78059, term78059.getClass(), "luid", "WIVENkFxNU");
        setIntField(term78076, term78076.getClass(), "year", 2020);
        setShortField(term78076, term78076.getClass(), "month", (short) 7);
        setShortField(term78076, term78076.getClass(), "day", (short) 24);
        setField(term78075, term78075.getClass(), "date", term78076);
        setByteField(term78080, term78080.getClass(), "hour", (byte) 22);
        setByteField(term78080, term78080.getClass(), "minute", (byte) 16);
        setByteField(term78080, term78080.getClass(), "second", (byte) 59);
        setIntField(term78080, term78080.getClass(), "nano", 588569833);
        setField(term78075, term78075.getClass(), "time", term78080);
        setField(term78059, term78059.getClass(), "registerTime", term78075);
        setIntField(term78086, term78086.getClass(), "year", 2019);
        setShortField(term78086, term78086.getClass(), "month", (short) 8);
        setShortField(term78086, term78086.getClass(), "day", (short) 6);
        setField(term78085, term78085.getClass(), "date", term78086);
        setByteField(term78090, term78090.getClass(), "hour", (byte) 5);
        setByteField(term78090, term78090.getClass(), "minute", (byte) 32);
        setByteField(term78090, term78090.getClass(), "second", (byte) 47);
        setIntField(term78090, term78090.getClass(), "nano", 73220317);
        setField(term78085, term78085.getClass(), "time", term78090);
        setField(term78059, term78059.getClass(), "accessTime", term78085);
        setField(term78057, term78057.getClass(), "card", term78059);
        setField(term78057, term78057.getClass(), "userName", "MFSosHURtm");
        setIntField(term78057, term78057.getClass(), "isNetMember", 283054332);
        setIntField(term78057, term78057.getClass(), "iconId", 627879820);
        setIntField(term78057, term78057.getClass(), "plateId", -40238432);
        setIntField(term78057, term78057.getClass(), "titleId", -263665532);
        setIntField(term78057, term78057.getClass(), "partnerId", -662026247);
        setIntField(term78057, term78057.getClass(), "frameId", -549576351);
        setIntField(term78057, term78057.getClass(), "selectMapId", 903450678);
        setIntField(term78057, term78057.getClass(), "totalAwake", -923344894);
        setIntField(term78057, term78057.getClass(), "gradeRating", 1165279948);
        setIntField(term78057, term78057.getClass(), "musicRating", 842516803);
        setIntField(term78057, term78057.getClass(), "playerRating", -1562310043);
        setIntField(term78057, term78057.getClass(), "highestRating", 57936993);
        setIntField(term78057, term78057.getClass(), "gradeRank", -1963541241);
        setIntField(term78057, term78057.getClass(), "classRank", 148495350);
        setIntField(term78057, term78057.getClass(), "courseRank", 258478328);
        setField(term78057, term78057.getClass(), "charaSlot", term78122);
        setField(term78057, term78057.getClass(), "charaLockSlot", term78138);
        setLongField(term78057, term78057.getClass(), "contentBit", -8767451917246862609L);
        setIntField(term78057, term78057.getClass(), "playCount", 1079181683);
        setField(term78057, term78057.getClass(), "eventWatchedDate", "hIBYlJpYye");
        setField(term78057, term78057.getClass(), "lastGameId", "LNendOzJhj");
        setField(term78057, term78057.getClass(), "lastRomVersion", "ZwcevQDgzv");
        setField(term78057, term78057.getClass(), "lastDataVersion", "rzkENrHYBI");
        setField(term78057, term78057.getClass(), "lastLoginDate", "ylJjmNVzzt");
        setField(term78057, term78057.getClass(), "lastPlayDate", "nwKTRDmHWk");
        setIntField(term78057, term78057.getClass(), "lastPlayCredit", 62795043);
        setIntField(term78057, term78057.getClass(), "lastPlayMode", 700442161);
        setIntField(term78057, term78057.getClass(), "lastPlaceId", 1901393171);
        setField(term78057, term78057.getClass(), "lastPlaceName", "UueEixdrss");
        setIntField(term78057, term78057.getClass(), "lastAllNetId", -1708841585);
        setIntField(term78057, term78057.getClass(), "lastRegionId", -704298059);
        setField(term78057, term78057.getClass(), "lastRegionName", "ceafBXJyBB");
        setField(term78057, term78057.getClass(), "lastClientId", "VNHIbCXqhH");
        setField(term78057, term78057.getClass(), "lastCountryCode", "csnhUIxUaP");
        setIntField(term78057, term78057.getClass(), "lastSelectEMoney", 1963830726);
        setIntField(term78057, term78057.getClass(), "lastSelectTicket", -1467028089);
        setIntField(term78057, term78057.getClass(), "lastSelectCourse", -714190515);
        setIntField(term78057, term78057.getClass(), "lastCountCourse", 492120544);
        setField(term78057, term78057.getClass(), "firstGameId", "fmWYICGnwt");
        setField(term78057, term78057.getClass(), "firstRomVersion", "FlZbOFNISk");
        setField(term78057, term78057.getClass(), "firstDataVersion", "zDtePZrZQH");
        setField(term78057, term78057.getClass(), "firstPlayDate", "YPVZjrbvVl");
        setField(term78057, term78057.getClass(), "compatibleCmVersion", "TWsXTUTREq");
        setField(term78057, term78057.getClass(), "dailyBonusDate", "tVsPWASlsh");
        setField(term78057, term78057.getClass(), "dailyCourseBonusDate", "PjZoebHrvq");
        setField(term78057, term78057.getClass(), "lastPairLoginDate", "VwpicfUdWr");
        setField(term78057, term78057.getClass(), "lastTrialPlayDate", "UDKBkeWilS");
        setIntField(term78057, term78057.getClass(), "playVsCount", -832143098);
        setIntField(term78057, term78057.getClass(), "playSyncCount", 919518312);
        setIntField(term78057, term78057.getClass(), "winCount", 363743117);
        setIntField(term78057, term78057.getClass(), "helpCount", -1659784438);
        setIntField(term78057, term78057.getClass(), "comboCount", -1912629150);
        setLongField(term78057, term78057.getClass(), "totalDeluxscore", 1886820706698769775L);
        setLongField(term78057, term78057.getClass(), "totalBasicDeluxscore", 8154151569172957467L);
        setLongField(term78057, term78057.getClass(), "totalAdvancedDeluxscore", -1835390437836814514L);
        setLongField(term78057, term78057.getClass(), "totalExpertDeluxscore", 5164274630708382393L);
        setLongField(term78057, term78057.getClass(), "totalMasterDeluxscore", 4110746064383978605L);
        setLongField(term78057, term78057.getClass(), "totalReMasterDeluxscore", 6102098033693999355L);
        setIntField(term78057, term78057.getClass(), "totalSync", 593205725);
        setIntField(term78057, term78057.getClass(), "totalBasicSync", -482661954);
        setIntField(term78057, term78057.getClass(), "totalAdvancedSync", -1449003566);
        setIntField(term78057, term78057.getClass(), "totalExpertSync", -649826731);
        setIntField(term78057, term78057.getClass(), "totalMasterSync", 506165302);
        setIntField(term78057, term78057.getClass(), "totalReMasterSync", 932736092);
        setLongField(term78057, term78057.getClass(), "totalAchievement", -3823857953281104599L);
        setLongField(term78057, term78057.getClass(), "totalBasicAchievement", 7198604597199389645L);
        setLongField(term78057, term78057.getClass(), "totalAdvancedAchievement", 5086825752167561926L);
        setLongField(term78057, term78057.getClass(), "totalExpertAchievement", -4725887165801530567L);
        setLongField(term78057, term78057.getClass(), "totalMasterAchievement", 164578074703380846L);
        setLongField(term78057, term78057.getClass(), "totalReMasterAchievement", -2204297060614169845L);
        setLongField(term78057, term78057.getClass(), "playerOldRating", -4706256794979273095L);
        setLongField(term78057, term78057.getClass(), "playerNewRating", 7093662559318062264L);
        setIntField(term78057, term78057.getClass(), "banState", 1792344129);
        setLongField(term78057, term78057.getClass(), "dateTime", -2279010181902401809L);
        setField(term78055, term78055.getClass(), "user", term78057);
        setIntField(term78055, term78055.getClass(), "courseId", -1718734463);
        setBooleanField(term78055, term78055.getClass(), "isLastClear", true);
        setIntField(term78055, term78055.getClass(), "totalRestlife", -843385533);
        setIntField(term78055, term78055.getClass(), "totalAchievement", -156627014);
        setIntField(term78055, term78055.getClass(), "totalDeluxscore", -933160129);
        setIntField(term78055, term78055.getClass(), "playCount", 1272821016);
        setField(term78055, term78055.getClass(), "clearDate", "bNeNAYRdqb");
        setField(term78055, term78055.getClass(), "lastPlayDate", "dcGBEVfYLI");
        setIntField(term78055, term78055.getClass(), "bestAchievement", -1553822493);
        setField(term78055, term78055.getClass(), "bestAchievementDate", "AbYQkbUCWK");
        setIntField(term78055, term78055.getClass(), "bestDeluxscore", -623107839);
        setField(term78055, term78055.getClass(), "bestDeluxscoreDate", "PjENVjWdrp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestAchievement", argTypes, term78055, args);
    }

};


