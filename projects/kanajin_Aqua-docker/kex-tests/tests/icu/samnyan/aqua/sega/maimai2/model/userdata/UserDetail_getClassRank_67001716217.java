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

public class UserDetail_getClassRank_67001716217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204725;

    public UserDetail_getClassRank_67001716217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term204729 = new Long(3662777917800385964L);
        Integer term204792 = new Integer(74684104);
        Integer term204794 = new Integer(502851553);
        Integer term204796 = new Integer(-1149654883);
        ArrayList term204790 = new ArrayList();
        ((ArrayList) term204790).add(term204792);
        ((ArrayList) term204790).add(term204794);
        ((ArrayList) term204790).add(term204796);
        Integer term204802 = new Integer(-346017809);
        Integer term204804 = new Integer(1922136769);
        ArrayList term204800 = new ArrayList();
        ((ArrayList) term204800).add(term204802);
        ((ArrayList) term204800).add(term204804);
        term204725 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term204727 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term204743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204758 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term204725, term204725.getClass(), "id", -6049545420317042559L);
        setLongField(term204727, term204727.getClass(), "id", 6506840278977311745L);
        setField(term204727, term204727.getClass(), "extId", term204729);
        setField(term204727, term204727.getClass(), "luid", "JRdGhDJvlf");
        setIntField(term204744, term204744.getClass(), "year", 2018);
        setShortField(term204744, term204744.getClass(), "month", (short) 7);
        setShortField(term204744, term204744.getClass(), "day", (short) 9);
        setField(term204743, term204743.getClass(), "date", term204744);
        setByteField(term204748, term204748.getClass(), "hour", (byte) 23);
        setByteField(term204748, term204748.getClass(), "minute", (byte) 14);
        setByteField(term204748, term204748.getClass(), "second", (byte) 46);
        setIntField(term204748, term204748.getClass(), "nano", 735911690);
        setField(term204743, term204743.getClass(), "time", term204748);
        setField(term204727, term204727.getClass(), "registerTime", term204743);
        setIntField(term204754, term204754.getClass(), "year", 2013);
        setShortField(term204754, term204754.getClass(), "month", (short) 3);
        setShortField(term204754, term204754.getClass(), "day", (short) 22);
        setField(term204753, term204753.getClass(), "date", term204754);
        setByteField(term204758, term204758.getClass(), "hour", (byte) 5);
        setByteField(term204758, term204758.getClass(), "minute", (byte) 34);
        setByteField(term204758, term204758.getClass(), "second", (byte) 39);
        setIntField(term204758, term204758.getClass(), "nano", 3203168);
        setField(term204753, term204753.getClass(), "time", term204758);
        setField(term204727, term204727.getClass(), "accessTime", term204753);
        setField(term204725, term204725.getClass(), "card", term204727);
        setField(term204725, term204725.getClass(), "userName", "eTowdwLwIC");
        setIntField(term204725, term204725.getClass(), "isNetMember", -2037783207);
        setIntField(term204725, term204725.getClass(), "iconId", 799731049);
        setIntField(term204725, term204725.getClass(), "plateId", 1446415915);
        setIntField(term204725, term204725.getClass(), "titleId", 1616695923);
        setIntField(term204725, term204725.getClass(), "partnerId", -1952633376);
        setIntField(term204725, term204725.getClass(), "frameId", -2077418776);
        setIntField(term204725, term204725.getClass(), "selectMapId", 1888684596);
        setIntField(term204725, term204725.getClass(), "totalAwake", 1391968678);
        setIntField(term204725, term204725.getClass(), "gradeRating", -573573198);
        setIntField(term204725, term204725.getClass(), "musicRating", -721584808);
        setIntField(term204725, term204725.getClass(), "playerRating", 2146307582);
        setIntField(term204725, term204725.getClass(), "highestRating", 816418778);
        setIntField(term204725, term204725.getClass(), "gradeRank", -1343139679);
        setIntField(term204725, term204725.getClass(), "classRank", -1422276108);
        setIntField(term204725, term204725.getClass(), "courseRank", 629145097);
        setField(term204725, term204725.getClass(), "charaSlot", term204790);
        setField(term204725, term204725.getClass(), "charaLockSlot", term204800);
        setLongField(term204725, term204725.getClass(), "contentBit", 4984827162222228924L);
        setIntField(term204725, term204725.getClass(), "playCount", -1038526476);
        setField(term204725, term204725.getClass(), "eventWatchedDate", "ZZsQCEEVKE");
        setField(term204725, term204725.getClass(), "lastGameId", "hKBSHXXlvX");
        setField(term204725, term204725.getClass(), "lastRomVersion", "pZqmVVEcJR");
        setField(term204725, term204725.getClass(), "lastDataVersion", "vaYnGhiSYc");
        setField(term204725, term204725.getClass(), "lastLoginDate", "iCvpnoRweF");
        setField(term204725, term204725.getClass(), "lastPlayDate", "inQpmScxiy");
        setIntField(term204725, term204725.getClass(), "lastPlayCredit", -1620249948);
        setIntField(term204725, term204725.getClass(), "lastPlayMode", 407409382);
        setIntField(term204725, term204725.getClass(), "lastPlaceId", -434813900);
        setField(term204725, term204725.getClass(), "lastPlaceName", "pxviRKMdhZ");
        setIntField(term204725, term204725.getClass(), "lastAllNetId", -1591071874);
        setIntField(term204725, term204725.getClass(), "lastRegionId", -1309509159);
        setField(term204725, term204725.getClass(), "lastRegionName", "mzpZtwUvBH");
        setField(term204725, term204725.getClass(), "lastClientId", "vjGhzsSgdc");
        setField(term204725, term204725.getClass(), "lastCountryCode", "CrRdosOwUB");
        setIntField(term204725, term204725.getClass(), "lastSelectEMoney", 876797689);
        setIntField(term204725, term204725.getClass(), "lastSelectTicket", -851468449);
        setIntField(term204725, term204725.getClass(), "lastSelectCourse", -1514712203);
        setIntField(term204725, term204725.getClass(), "lastCountCourse", 1598781132);
        setField(term204725, term204725.getClass(), "firstGameId", "pRlplVwvQY");
        setField(term204725, term204725.getClass(), "firstRomVersion", "UqVSwrKROE");
        setField(term204725, term204725.getClass(), "firstDataVersion", "UmMuZdvRme");
        setField(term204725, term204725.getClass(), "firstPlayDate", "EQXkjUFyjP");
        setField(term204725, term204725.getClass(), "compatibleCmVersion", "DryaIkTsAU");
        setField(term204725, term204725.getClass(), "dailyBonusDate", "yepnxnHDdp");
        setField(term204725, term204725.getClass(), "dailyCourseBonusDate", "pxILvBKWRo");
        setField(term204725, term204725.getClass(), "lastPairLoginDate", "OrMrzSscwB");
        setField(term204725, term204725.getClass(), "lastTrialPlayDate", "qOiZVTUasG");
        setIntField(term204725, term204725.getClass(), "playVsCount", 1899169938);
        setIntField(term204725, term204725.getClass(), "playSyncCount", 2086291792);
        setIntField(term204725, term204725.getClass(), "winCount", -1433187744);
        setIntField(term204725, term204725.getClass(), "helpCount", 1762255097);
        setIntField(term204725, term204725.getClass(), "comboCount", 888018912);
        setLongField(term204725, term204725.getClass(), "totalDeluxscore", -4977729913285104357L);
        setLongField(term204725, term204725.getClass(), "totalBasicDeluxscore", -7632402404509832308L);
        setLongField(term204725, term204725.getClass(), "totalAdvancedDeluxscore", 4147344134637411052L);
        setLongField(term204725, term204725.getClass(), "totalExpertDeluxscore", -5721314969496372665L);
        setLongField(term204725, term204725.getClass(), "totalMasterDeluxscore", 3145258254248365850L);
        setLongField(term204725, term204725.getClass(), "totalReMasterDeluxscore", -6960693994602911362L);
        setIntField(term204725, term204725.getClass(), "totalSync", 856692442);
        setIntField(term204725, term204725.getClass(), "totalBasicSync", -2001484892);
        setIntField(term204725, term204725.getClass(), "totalAdvancedSync", -196301425);
        setIntField(term204725, term204725.getClass(), "totalExpertSync", 1709968466);
        setIntField(term204725, term204725.getClass(), "totalMasterSync", 1751184955);
        setIntField(term204725, term204725.getClass(), "totalReMasterSync", 1782993942);
        setLongField(term204725, term204725.getClass(), "totalAchievement", -2677397085138664479L);
        setLongField(term204725, term204725.getClass(), "totalBasicAchievement", 5853848687282756413L);
        setLongField(term204725, term204725.getClass(), "totalAdvancedAchievement", 4438254867600550639L);
        setLongField(term204725, term204725.getClass(), "totalExpertAchievement", 8051628118406926225L);
        setLongField(term204725, term204725.getClass(), "totalMasterAchievement", 7808475277288474254L);
        setLongField(term204725, term204725.getClass(), "totalReMasterAchievement", -4931395592119755702L);
        setLongField(term204725, term204725.getClass(), "playerOldRating", -3467617408797888248L);
        setLongField(term204725, term204725.getClass(), "playerNewRating", 7425258440383487233L);
        setIntField(term204725, term204725.getClass(), "banState", 963677814);
        setLongField(term204725, term204725.getClass(), "dateTime", -3029001302245362106L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassRank", argTypes, term204725, args);
    }

};


