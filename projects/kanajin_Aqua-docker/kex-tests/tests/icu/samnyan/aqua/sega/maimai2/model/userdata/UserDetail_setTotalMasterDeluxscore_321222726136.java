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

public class UserDetail_setTotalMasterDeluxscore_321222726136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4307185;
     Object term4307542;

    public UserDetail_setTotalMasterDeluxscore_321222726136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4307189 = new Long(4652127938324994599L);
        Integer term4307252 = new Integer(-1089564718);
        Integer term4307254 = new Integer(1985944979);
        Integer term4307256 = new Integer(600742414);
        Integer term4307258 = new Integer(-848491327);
        ArrayList term4307250 = new ArrayList();
        ((ArrayList) term4307250).add(term4307252);
        ((ArrayList) term4307250).add(term4307254);
        ((ArrayList) term4307250).add(term4307256);
        ((ArrayList) term4307250).add(term4307258);
        Integer term4307264 = new Integer(271036746);
        Integer term4307266 = new Integer(1921972298);
        Integer term4307268 = new Integer(1759412486);
        Integer term4307270 = new Integer(-609040240);
        Integer term4307272 = new Integer(-263119455);
        ArrayList term4307262 = new ArrayList();
        ((ArrayList) term4307262).add(term4307264);
        ((ArrayList) term4307262).add(term4307266);
        ((ArrayList) term4307262).add(term4307268);
        ((ArrayList) term4307262).add(term4307270);
        ((ArrayList) term4307262).add(term4307272);
        term4307185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4307187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4307203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4307204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4307208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4307213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4307214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4307218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4307185, term4307185.getClass(), "id", -4455770952914085821L);
        setLongField(term4307187, term4307187.getClass(), "id", 4739817697818038810L);
        setField(term4307187, term4307187.getClass(), "extId", term4307189);
        setField(term4307187, term4307187.getClass(), "luid", "tZQIuftiDV");
        setIntField(term4307204, term4307204.getClass(), "year", 2013);
        setShortField(term4307204, term4307204.getClass(), "month", (short) 8);
        setShortField(term4307204, term4307204.getClass(), "day", (short) 5);
        setField(term4307203, term4307203.getClass(), "date", term4307204);
        setByteField(term4307208, term4307208.getClass(), "hour", (byte) 5);
        setByteField(term4307208, term4307208.getClass(), "minute", (byte) 41);
        setByteField(term4307208, term4307208.getClass(), "second", (byte) 48);
        setIntField(term4307208, term4307208.getClass(), "nano", 75774015);
        setField(term4307203, term4307203.getClass(), "time", term4307208);
        setField(term4307187, term4307187.getClass(), "registerTime", term4307203);
        setIntField(term4307214, term4307214.getClass(), "year", 2013);
        setShortField(term4307214, term4307214.getClass(), "month", (short) 11);
        setShortField(term4307214, term4307214.getClass(), "day", (short) 14);
        setField(term4307213, term4307213.getClass(), "date", term4307214);
        setByteField(term4307218, term4307218.getClass(), "hour", (byte) 8);
        setByteField(term4307218, term4307218.getClass(), "minute", (byte) 24);
        setByteField(term4307218, term4307218.getClass(), "second", (byte) 23);
        setIntField(term4307218, term4307218.getClass(), "nano", 682846121);
        setField(term4307213, term4307213.getClass(), "time", term4307218);
        setField(term4307187, term4307187.getClass(), "accessTime", term4307213);
        setField(term4307185, term4307185.getClass(), "card", term4307187);
        setField(term4307185, term4307185.getClass(), "userName", "IrYjpWwnpn");
        setIntField(term4307185, term4307185.getClass(), "isNetMember", 2125133384);
        setIntField(term4307185, term4307185.getClass(), "iconId", 741846783);
        setIntField(term4307185, term4307185.getClass(), "plateId", 99932939);
        setIntField(term4307185, term4307185.getClass(), "titleId", 477073657);
        setIntField(term4307185, term4307185.getClass(), "partnerId", -10687484);
        setIntField(term4307185, term4307185.getClass(), "frameId", -1509427106);
        setIntField(term4307185, term4307185.getClass(), "selectMapId", 1975985480);
        setIntField(term4307185, term4307185.getClass(), "totalAwake", -281737311);
        setIntField(term4307185, term4307185.getClass(), "gradeRating", 1986446505);
        setIntField(term4307185, term4307185.getClass(), "musicRating", -213742343);
        setIntField(term4307185, term4307185.getClass(), "playerRating", 681292902);
        setIntField(term4307185, term4307185.getClass(), "highestRating", 1472392270);
        setIntField(term4307185, term4307185.getClass(), "gradeRank", 1598717121);
        setIntField(term4307185, term4307185.getClass(), "classRank", -1910740592);
        setIntField(term4307185, term4307185.getClass(), "courseRank", -333840755);
        setField(term4307185, term4307185.getClass(), "charaSlot", term4307250);
        setField(term4307185, term4307185.getClass(), "charaLockSlot", term4307262);
        setLongField(term4307185, term4307185.getClass(), "contentBit", 4813821511976404803L);
        setIntField(term4307185, term4307185.getClass(), "playCount", 560983671);
        setField(term4307185, term4307185.getClass(), "eventWatchedDate", "aOhWKDOsBJ");
        setField(term4307185, term4307185.getClass(), "lastGameId", "PJFfktdRGZ");
        setField(term4307185, term4307185.getClass(), "lastRomVersion", "kLjZYdkDty");
        setField(term4307185, term4307185.getClass(), "lastDataVersion", "iPPpyyOHZi");
        setField(term4307185, term4307185.getClass(), "lastLoginDate", "mINMcFWJxf");
        setField(term4307185, term4307185.getClass(), "lastPlayDate", "trNhnjyYlp");
        setIntField(term4307185, term4307185.getClass(), "lastPlayCredit", -2010470099);
        setIntField(term4307185, term4307185.getClass(), "lastPlayMode", -1595559431);
        setIntField(term4307185, term4307185.getClass(), "lastPlaceId", -439129957);
        setField(term4307185, term4307185.getClass(), "lastPlaceName", "HDAsAbMIZl");
        setIntField(term4307185, term4307185.getClass(), "lastAllNetId", -1837857542);
        setIntField(term4307185, term4307185.getClass(), "lastRegionId", -918045587);
        setField(term4307185, term4307185.getClass(), "lastRegionName", "HWHsUlPSds");
        setField(term4307185, term4307185.getClass(), "lastClientId", "CaClykruYU");
        setField(term4307185, term4307185.getClass(), "lastCountryCode", "GzenbicUVn");
        setIntField(term4307185, term4307185.getClass(), "lastSelectEMoney", -2058664180);
        setIntField(term4307185, term4307185.getClass(), "lastSelectTicket", -2082908416);
        setIntField(term4307185, term4307185.getClass(), "lastSelectCourse", -114493652);
        setIntField(term4307185, term4307185.getClass(), "lastCountCourse", 884333599);
        setField(term4307185, term4307185.getClass(), "firstGameId", "mDToCabmgg");
        setField(term4307185, term4307185.getClass(), "firstRomVersion", "yLmpBXzpkZ");
        setField(term4307185, term4307185.getClass(), "firstDataVersion", "giqibgkqrH");
        setField(term4307185, term4307185.getClass(), "firstPlayDate", "fAcXdBQpot");
        setField(term4307185, term4307185.getClass(), "compatibleCmVersion", "MKLYPdmIku");
        setField(term4307185, term4307185.getClass(), "dailyBonusDate", "lwuioXEnmf");
        setField(term4307185, term4307185.getClass(), "dailyCourseBonusDate", "HoYbVXuAcr");
        setField(term4307185, term4307185.getClass(), "lastPairLoginDate", "dHIYImqVoG");
        setField(term4307185, term4307185.getClass(), "lastTrialPlayDate", "SdSgvjRLDJ");
        setIntField(term4307185, term4307185.getClass(), "playVsCount", -1069070367);
        setIntField(term4307185, term4307185.getClass(), "playSyncCount", 170453225);
        setIntField(term4307185, term4307185.getClass(), "winCount", 1783259952);
        setIntField(term4307185, term4307185.getClass(), "helpCount", -899937595);
        setIntField(term4307185, term4307185.getClass(), "comboCount", 1576792637);
        setLongField(term4307185, term4307185.getClass(), "totalDeluxscore", 2285667147023584411L);
        setLongField(term4307185, term4307185.getClass(), "totalBasicDeluxscore", -8576571112687994553L);
        setLongField(term4307185, term4307185.getClass(), "totalAdvancedDeluxscore", 5218333360204134974L);
        setLongField(term4307185, term4307185.getClass(), "totalExpertDeluxscore", 4850385130454374081L);
        setLongField(term4307185, term4307185.getClass(), "totalMasterDeluxscore", -2689608189308030554L);
        setLongField(term4307185, term4307185.getClass(), "totalReMasterDeluxscore", 2899595601747556786L);
        setIntField(term4307185, term4307185.getClass(), "totalSync", -680214112);
        setIntField(term4307185, term4307185.getClass(), "totalBasicSync", -1243785844);
        setIntField(term4307185, term4307185.getClass(), "totalAdvancedSync", 1712695755);
        setIntField(term4307185, term4307185.getClass(), "totalExpertSync", -998795704);
        setIntField(term4307185, term4307185.getClass(), "totalMasterSync", -243825614);
        setIntField(term4307185, term4307185.getClass(), "totalReMasterSync", 1958331897);
        setLongField(term4307185, term4307185.getClass(), "totalAchievement", 8718159380067511117L);
        setLongField(term4307185, term4307185.getClass(), "totalBasicAchievement", -4318468996241010609L);
        setLongField(term4307185, term4307185.getClass(), "totalAdvancedAchievement", -2663148696722481464L);
        setLongField(term4307185, term4307185.getClass(), "totalExpertAchievement", -2630668293476088351L);
        setLongField(term4307185, term4307185.getClass(), "totalMasterAchievement", -919364647749226418L);
        setLongField(term4307185, term4307185.getClass(), "totalReMasterAchievement", -2999936069975960084L);
        setLongField(term4307185, term4307185.getClass(), "playerOldRating", -7278135389379022214L);
        setLongField(term4307185, term4307185.getClass(), "playerNewRating", -8917221758685172333L);
        setIntField(term4307185, term4307185.getClass(), "banState", 870029255);
        setLongField(term4307185, term4307185.getClass(), "dateTime", 3500203971877208143L);
        term4307542 = new Long(7736584981046279994L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4307542;
        callMethod(klass, "setTotalMasterDeluxscore", argTypes, term4307185, args);
    }

};


