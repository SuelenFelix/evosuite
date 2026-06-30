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

public class UserDetail_getCard_13315589191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196125;

    public UserDetail_getCard_13315589191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term196129 = new Long(-6490254947459640565L);
        Integer term196192 = new Integer(1979972143);
        Integer term196194 = new Integer(-1445141749);
        Integer term196196 = new Integer(231866725);
        Integer term196198 = new Integer(264142674);
        Integer term196200 = new Integer(318938584);
        ArrayList term196190 = new ArrayList();
        ((ArrayList) term196190).add(term196192);
        ((ArrayList) term196190).add(term196194);
        ((ArrayList) term196190).add(term196196);
        ((ArrayList) term196190).add(term196198);
        ((ArrayList) term196190).add(term196200);
        Integer term196206 = new Integer(804113142);
        Integer term196208 = new Integer(1426555916);
        Integer term196210 = new Integer(96582503);
        Integer term196212 = new Integer(-2078044123);
        Integer term196214 = new Integer(-888123997);
        Integer term196216 = new Integer(1348905505);
        Integer term196218 = new Integer(670473947);
        Integer term196220 = new Integer(24416797);
        ArrayList term196204 = new ArrayList();
        ((ArrayList) term196204).add(term196206);
        ((ArrayList) term196204).add(term196208);
        ((ArrayList) term196204).add(term196210);
        ((ArrayList) term196204).add(term196212);
        ((ArrayList) term196204).add(term196214);
        ((ArrayList) term196204).add(term196216);
        ((ArrayList) term196204).add(term196218);
        ((ArrayList) term196204).add(term196220);
        term196125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term196127 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term196143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term196153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term196154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196158 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term196125, term196125.getClass(), "id", -3906523385150190041L);
        setLongField(term196127, term196127.getClass(), "id", 5260599369554276149L);
        setField(term196127, term196127.getClass(), "extId", term196129);
        setField(term196127, term196127.getClass(), "luid", "ktAQrMqyFJ");
        setIntField(term196144, term196144.getClass(), "year", 2014);
        setShortField(term196144, term196144.getClass(), "month", (short) 1);
        setShortField(term196144, term196144.getClass(), "day", (short) 6);
        setField(term196143, term196143.getClass(), "date", term196144);
        setByteField(term196148, term196148.getClass(), "hour", (byte) 13);
        setByteField(term196148, term196148.getClass(), "minute", (byte) 4);
        setByteField(term196148, term196148.getClass(), "second", (byte) 34);
        setIntField(term196148, term196148.getClass(), "nano", 465558975);
        setField(term196143, term196143.getClass(), "time", term196148);
        setField(term196127, term196127.getClass(), "registerTime", term196143);
        setIntField(term196154, term196154.getClass(), "year", 2016);
        setShortField(term196154, term196154.getClass(), "month", (short) 8);
        setShortField(term196154, term196154.getClass(), "day", (short) 23);
        setField(term196153, term196153.getClass(), "date", term196154);
        setByteField(term196158, term196158.getClass(), "hour", (byte) 15);
        setByteField(term196158, term196158.getClass(), "minute", (byte) 21);
        setByteField(term196158, term196158.getClass(), "second", (byte) 10);
        setIntField(term196158, term196158.getClass(), "nano", 549669034);
        setField(term196153, term196153.getClass(), "time", term196158);
        setField(term196127, term196127.getClass(), "accessTime", term196153);
        setField(term196125, term196125.getClass(), "card", term196127);
        setField(term196125, term196125.getClass(), "userName", "opvZXdLOeG");
        setIntField(term196125, term196125.getClass(), "isNetMember", -287532994);
        setIntField(term196125, term196125.getClass(), "iconId", -224320349);
        setIntField(term196125, term196125.getClass(), "plateId", -526888962);
        setIntField(term196125, term196125.getClass(), "titleId", -23497981);
        setIntField(term196125, term196125.getClass(), "partnerId", -1204518409);
        setIntField(term196125, term196125.getClass(), "frameId", 1564920368);
        setIntField(term196125, term196125.getClass(), "selectMapId", 380619960);
        setIntField(term196125, term196125.getClass(), "totalAwake", 2032116097);
        setIntField(term196125, term196125.getClass(), "gradeRating", -1529610099);
        setIntField(term196125, term196125.getClass(), "musicRating", 101565487);
        setIntField(term196125, term196125.getClass(), "playerRating", -1974519039);
        setIntField(term196125, term196125.getClass(), "highestRating", 2093268279);
        setIntField(term196125, term196125.getClass(), "gradeRank", -197188292);
        setIntField(term196125, term196125.getClass(), "classRank", 1982258363);
        setIntField(term196125, term196125.getClass(), "courseRank", -2134281126);
        setField(term196125, term196125.getClass(), "charaSlot", term196190);
        setField(term196125, term196125.getClass(), "charaLockSlot", term196204);
        setLongField(term196125, term196125.getClass(), "contentBit", 8512409455428516754L);
        setIntField(term196125, term196125.getClass(), "playCount", -1023001269);
        setField(term196125, term196125.getClass(), "eventWatchedDate", "CEbsFjwCEa");
        setField(term196125, term196125.getClass(), "lastGameId", "yBOGhnrobI");
        setField(term196125, term196125.getClass(), "lastRomVersion", "oBMtVEyUVi");
        setField(term196125, term196125.getClass(), "lastDataVersion", "HMCVESmviS");
        setField(term196125, term196125.getClass(), "lastLoginDate", "YbonlejajI");
        setField(term196125, term196125.getClass(), "lastPlayDate", "OagWYKvTVA");
        setIntField(term196125, term196125.getClass(), "lastPlayCredit", 2123871728);
        setIntField(term196125, term196125.getClass(), "lastPlayMode", 687921602);
        setIntField(term196125, term196125.getClass(), "lastPlaceId", -848859060);
        setField(term196125, term196125.getClass(), "lastPlaceName", "pTahHEFmUl");
        setIntField(term196125, term196125.getClass(), "lastAllNetId", 276568220);
        setIntField(term196125, term196125.getClass(), "lastRegionId", -434766528);
        setField(term196125, term196125.getClass(), "lastRegionName", "JtSiTSYFjh");
        setField(term196125, term196125.getClass(), "lastClientId", "jrGBzCkgWr");
        setField(term196125, term196125.getClass(), "lastCountryCode", "dtotxQeUmY");
        setIntField(term196125, term196125.getClass(), "lastSelectEMoney", 1954430952);
        setIntField(term196125, term196125.getClass(), "lastSelectTicket", 1603606390);
        setIntField(term196125, term196125.getClass(), "lastSelectCourse", -234709686);
        setIntField(term196125, term196125.getClass(), "lastCountCourse", -550885989);
        setField(term196125, term196125.getClass(), "firstGameId", "xlfrOHXLcP");
        setField(term196125, term196125.getClass(), "firstRomVersion", "ScyVgkgWQC");
        setField(term196125, term196125.getClass(), "firstDataVersion", "EupIzTtIGl");
        setField(term196125, term196125.getClass(), "firstPlayDate", "ipqSPLoaHR");
        setField(term196125, term196125.getClass(), "compatibleCmVersion", "OvhEUawYLa");
        setField(term196125, term196125.getClass(), "dailyBonusDate", "ZGoWfxYnff");
        setField(term196125, term196125.getClass(), "dailyCourseBonusDate", "nEGtThxDpE");
        setField(term196125, term196125.getClass(), "lastPairLoginDate", "YJECmDWfFA");
        setField(term196125, term196125.getClass(), "lastTrialPlayDate", "nBVnXTgrAz");
        setIntField(term196125, term196125.getClass(), "playVsCount", 1661591466);
        setIntField(term196125, term196125.getClass(), "playSyncCount", -375409691);
        setIntField(term196125, term196125.getClass(), "winCount", 975944827);
        setIntField(term196125, term196125.getClass(), "helpCount", 880513984);
        setIntField(term196125, term196125.getClass(), "comboCount", -846950202);
        setLongField(term196125, term196125.getClass(), "totalDeluxscore", -156417672044938044L);
        setLongField(term196125, term196125.getClass(), "totalBasicDeluxscore", 1518829869108528527L);
        setLongField(term196125, term196125.getClass(), "totalAdvancedDeluxscore", 4613871478217348324L);
        setLongField(term196125, term196125.getClass(), "totalExpertDeluxscore", 87727912509233981L);
        setLongField(term196125, term196125.getClass(), "totalMasterDeluxscore", -6654481035819419893L);
        setLongField(term196125, term196125.getClass(), "totalReMasterDeluxscore", -1400699043856699114L);
        setIntField(term196125, term196125.getClass(), "totalSync", -109407576);
        setIntField(term196125, term196125.getClass(), "totalBasicSync", -2104308132);
        setIntField(term196125, term196125.getClass(), "totalAdvancedSync", 1163850867);
        setIntField(term196125, term196125.getClass(), "totalExpertSync", -37175334);
        setIntField(term196125, term196125.getClass(), "totalMasterSync", 657697442);
        setIntField(term196125, term196125.getClass(), "totalReMasterSync", 1692013158);
        setLongField(term196125, term196125.getClass(), "totalAchievement", 3788155517212733447L);
        setLongField(term196125, term196125.getClass(), "totalBasicAchievement", -2801739313642089867L);
        setLongField(term196125, term196125.getClass(), "totalAdvancedAchievement", 4733832587986907425L);
        setLongField(term196125, term196125.getClass(), "totalExpertAchievement", -4323196132938348713L);
        setLongField(term196125, term196125.getClass(), "totalMasterAchievement", -7899334444959009409L);
        setLongField(term196125, term196125.getClass(), "totalReMasterAchievement", 1416784594638459493L);
        setLongField(term196125, term196125.getClass(), "playerOldRating", 3864377246512683466L);
        setLongField(term196125, term196125.getClass(), "playerNewRating", 3755340473882774321L);
        setIntField(term196125, term196125.getClass(), "banState", 1102246253);
        setLongField(term196125, term196125.getClass(), "dateTime", 8946410365493398032L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term196125, args);
    }

};


