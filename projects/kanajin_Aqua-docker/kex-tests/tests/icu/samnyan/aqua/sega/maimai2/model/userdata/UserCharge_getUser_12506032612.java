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

public class UserCharge_getUser_12506032612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121560;

    public UserCharge_getUser_12506032612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121566 = new Long(5246058710498845622L);
        Integer term121629 = new Integer(1445291866);
        Integer term121631 = new Integer(-139927812);
        ArrayList term121627 = new ArrayList();
        ((ArrayList) term121627).add(term121629);
        ((ArrayList) term121627).add(term121631);
        ArrayList term121635 = new ArrayList();
        term121560 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term121562 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term121564 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term121580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term121560, term121560.getClass(), "id", -3593615111110492012L);
        setLongField(term121562, term121562.getClass(), "id", 659947615533781814L);
        setLongField(term121564, term121564.getClass(), "id", -4752004427270923675L);
        setField(term121564, term121564.getClass(), "extId", term121566);
        setField(term121564, term121564.getClass(), "luid", "rxVTeZJIuC");
        setIntField(term121581, term121581.getClass(), "year", 2025);
        setShortField(term121581, term121581.getClass(), "month", (short) 8);
        setShortField(term121581, term121581.getClass(), "day", (short) 18);
        setField(term121580, term121580.getClass(), "date", term121581);
        setByteField(term121585, term121585.getClass(), "hour", (byte) 11);
        setByteField(term121585, term121585.getClass(), "minute", (byte) 28);
        setByteField(term121585, term121585.getClass(), "second", (byte) 28);
        setIntField(term121585, term121585.getClass(), "nano", 32159081);
        setField(term121580, term121580.getClass(), "time", term121585);
        setField(term121564, term121564.getClass(), "registerTime", term121580);
        setIntField(term121591, term121591.getClass(), "year", 2026);
        setShortField(term121591, term121591.getClass(), "month", (short) 5);
        setShortField(term121591, term121591.getClass(), "day", (short) 14);
        setField(term121590, term121590.getClass(), "date", term121591);
        setByteField(term121595, term121595.getClass(), "hour", (byte) 3);
        setByteField(term121595, term121595.getClass(), "minute", (byte) 43);
        setByteField(term121595, term121595.getClass(), "second", (byte) 41);
        setIntField(term121595, term121595.getClass(), "nano", 519970122);
        setField(term121590, term121590.getClass(), "time", term121595);
        setField(term121564, term121564.getClass(), "accessTime", term121590);
        setField(term121562, term121562.getClass(), "card", term121564);
        setField(term121562, term121562.getClass(), "userName", "EPpDDOGAQG");
        setIntField(term121562, term121562.getClass(), "isNetMember", -1518311473);
        setIntField(term121562, term121562.getClass(), "iconId", 1910611561);
        setIntField(term121562, term121562.getClass(), "plateId", -141028019);
        setIntField(term121562, term121562.getClass(), "titleId", -2084912991);
        setIntField(term121562, term121562.getClass(), "partnerId", -374431639);
        setIntField(term121562, term121562.getClass(), "frameId", -1331172307);
        setIntField(term121562, term121562.getClass(), "selectMapId", 2092822782);
        setIntField(term121562, term121562.getClass(), "totalAwake", 1740023276);
        setIntField(term121562, term121562.getClass(), "gradeRating", 412259963);
        setIntField(term121562, term121562.getClass(), "musicRating", 581068095);
        setIntField(term121562, term121562.getClass(), "playerRating", 1081427463);
        setIntField(term121562, term121562.getClass(), "highestRating", -276588662);
        setIntField(term121562, term121562.getClass(), "gradeRank", 41461773);
        setIntField(term121562, term121562.getClass(), "classRank", 1130836028);
        setIntField(term121562, term121562.getClass(), "courseRank", 1084651639);
        setField(term121562, term121562.getClass(), "charaSlot", term121627);
        setField(term121562, term121562.getClass(), "charaLockSlot", term121635);
        setLongField(term121562, term121562.getClass(), "contentBit", -5521161457467523042L);
        setIntField(term121562, term121562.getClass(), "playCount", -5960347);
        setField(term121562, term121562.getClass(), "eventWatchedDate", "QCvbbAbluL");
        setField(term121562, term121562.getClass(), "lastGameId", "TCfDANoRXy");
        setField(term121562, term121562.getClass(), "lastRomVersion", "SNBGphBiIl");
        setField(term121562, term121562.getClass(), "lastDataVersion", "RmHGsfbaBq");
        setField(term121562, term121562.getClass(), "lastLoginDate", "RSDlfIpFkY");
        setField(term121562, term121562.getClass(), "lastPlayDate", "ZaTowywgws");
        setIntField(term121562, term121562.getClass(), "lastPlayCredit", 1080022248);
        setIntField(term121562, term121562.getClass(), "lastPlayMode", -1800860642);
        setIntField(term121562, term121562.getClass(), "lastPlaceId", -1679309135);
        setField(term121562, term121562.getClass(), "lastPlaceName", "XPrRiBUedX");
        setIntField(term121562, term121562.getClass(), "lastAllNetId", 1736740178);
        setIntField(term121562, term121562.getClass(), "lastRegionId", -202034601);
        setField(term121562, term121562.getClass(), "lastRegionName", "kultXgiMsw");
        setField(term121562, term121562.getClass(), "lastClientId", "invWIgTrSn");
        setField(term121562, term121562.getClass(), "lastCountryCode", "tdDWYXQBpB");
        setIntField(term121562, term121562.getClass(), "lastSelectEMoney", -151407958);
        setIntField(term121562, term121562.getClass(), "lastSelectTicket", 1537567964);
        setIntField(term121562, term121562.getClass(), "lastSelectCourse", 1552192679);
        setIntField(term121562, term121562.getClass(), "lastCountCourse", -655599823);
        setField(term121562, term121562.getClass(), "firstGameId", "yLbSZvdjZX");
        setField(term121562, term121562.getClass(), "firstRomVersion", "FhCGxrukXm");
        setField(term121562, term121562.getClass(), "firstDataVersion", "KAmjFnlvKU");
        setField(term121562, term121562.getClass(), "firstPlayDate", "VKpNTpPbui");
        setField(term121562, term121562.getClass(), "compatibleCmVersion", "TuzuoEoycc");
        setField(term121562, term121562.getClass(), "dailyBonusDate", "LXWldHIZNy");
        setField(term121562, term121562.getClass(), "dailyCourseBonusDate", "BATrPAXgpa");
        setField(term121562, term121562.getClass(), "lastPairLoginDate", "vgwMeHgaql");
        setField(term121562, term121562.getClass(), "lastTrialPlayDate", "apRNMfAeJs");
        setIntField(term121562, term121562.getClass(), "playVsCount", -1993642452);
        setIntField(term121562, term121562.getClass(), "playSyncCount", 1461590652);
        setIntField(term121562, term121562.getClass(), "winCount", -1671428336);
        setIntField(term121562, term121562.getClass(), "helpCount", -1465646058);
        setIntField(term121562, term121562.getClass(), "comboCount", 457823846);
        setLongField(term121562, term121562.getClass(), "totalDeluxscore", 5986332249270190194L);
        setLongField(term121562, term121562.getClass(), "totalBasicDeluxscore", -3409249187038060561L);
        setLongField(term121562, term121562.getClass(), "totalAdvancedDeluxscore", 3666152876006735353L);
        setLongField(term121562, term121562.getClass(), "totalExpertDeluxscore", -2786639501005568264L);
        setLongField(term121562, term121562.getClass(), "totalMasterDeluxscore", 3887138438306476169L);
        setLongField(term121562, term121562.getClass(), "totalReMasterDeluxscore", 1288678855951342110L);
        setIntField(term121562, term121562.getClass(), "totalSync", 1778294369);
        setIntField(term121562, term121562.getClass(), "totalBasicSync", -1206831454);
        setIntField(term121562, term121562.getClass(), "totalAdvancedSync", 1513524215);
        setIntField(term121562, term121562.getClass(), "totalExpertSync", 86829253);
        setIntField(term121562, term121562.getClass(), "totalMasterSync", 1622273215);
        setIntField(term121562, term121562.getClass(), "totalReMasterSync", 2023282992);
        setLongField(term121562, term121562.getClass(), "totalAchievement", -2483785120171854174L);
        setLongField(term121562, term121562.getClass(), "totalBasicAchievement", 246102557771929635L);
        setLongField(term121562, term121562.getClass(), "totalAdvancedAchievement", 8013180001130062999L);
        setLongField(term121562, term121562.getClass(), "totalExpertAchievement", -7249189341298396374L);
        setLongField(term121562, term121562.getClass(), "totalMasterAchievement", 8170323121887011771L);
        setLongField(term121562, term121562.getClass(), "totalReMasterAchievement", 1150165300363165306L);
        setLongField(term121562, term121562.getClass(), "playerOldRating", -7095519814518579268L);
        setLongField(term121562, term121562.getClass(), "playerNewRating", 6840349578265523330L);
        setIntField(term121562, term121562.getClass(), "banState", -854998820);
        setLongField(term121562, term121562.getClass(), "dateTime", -5498941518395349431L);
        setField(term121560, term121560.getClass(), "user", term121562);
        setIntField(term121560, term121560.getClass(), "chargeId", 1361637334);
        setIntField(term121560, term121560.getClass(), "stock", 640213918);
        setField(term121560, term121560.getClass(), "purchaseDate", "xXjFLOrnwn");
        setField(term121560, term121560.getClass(), "validDate", "EwHXheApdJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term121560, args);
    }

};


