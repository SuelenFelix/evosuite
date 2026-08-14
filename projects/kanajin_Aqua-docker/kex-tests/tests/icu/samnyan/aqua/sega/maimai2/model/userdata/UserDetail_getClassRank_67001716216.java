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

public class UserDetail_getClassRank_67001716216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204670;

    public UserDetail_getClassRank_67001716216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term204674 = new Long(3662777917800385964L);
        Integer term204737 = new Integer(74684104);
        Integer term204739 = new Integer(502851553);
        Integer term204741 = new Integer(-1149654883);
        ArrayList term204735 = new ArrayList();
        ((ArrayList) term204735).add(term204737);
        ((ArrayList) term204735).add(term204739);
        ((ArrayList) term204735).add(term204741);
        Integer term204747 = new Integer(-346017809);
        Integer term204749 = new Integer(1922136769);
        ArrayList term204745 = new ArrayList();
        ((ArrayList) term204745).add(term204747);
        ((ArrayList) term204745).add(term204749);
        term204670 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term204672 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term204688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204693 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term204699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term204703 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term204670, term204670.getClass(), "id", -6049545420317042559L);
        setLongField(term204672, term204672.getClass(), "id", 6506840278977311745L);
        setField(term204672, term204672.getClass(), "extId", term204674);
        setField(term204672, term204672.getClass(), "luid", "JRdGhDJvlf");
        setIntField(term204689, term204689.getClass(), "year", 2018);
        setShortField(term204689, term204689.getClass(), "month", (short) 7);
        setShortField(term204689, term204689.getClass(), "day", (short) 9);
        setField(term204688, term204688.getClass(), "date", term204689);
        setByteField(term204693, term204693.getClass(), "hour", (byte) 23);
        setByteField(term204693, term204693.getClass(), "minute", (byte) 14);
        setByteField(term204693, term204693.getClass(), "second", (byte) 46);
        setIntField(term204693, term204693.getClass(), "nano", 735911690);
        setField(term204688, term204688.getClass(), "time", term204693);
        setField(term204672, term204672.getClass(), "registerTime", term204688);
        setIntField(term204699, term204699.getClass(), "year", 2013);
        setShortField(term204699, term204699.getClass(), "month", (short) 3);
        setShortField(term204699, term204699.getClass(), "day", (short) 22);
        setField(term204698, term204698.getClass(), "date", term204699);
        setByteField(term204703, term204703.getClass(), "hour", (byte) 5);
        setByteField(term204703, term204703.getClass(), "minute", (byte) 34);
        setByteField(term204703, term204703.getClass(), "second", (byte) 39);
        setIntField(term204703, term204703.getClass(), "nano", 3203168);
        setField(term204698, term204698.getClass(), "time", term204703);
        setField(term204672, term204672.getClass(), "accessTime", term204698);
        setField(term204670, term204670.getClass(), "card", term204672);
        setField(term204670, term204670.getClass(), "userName", "eTowdwLwIC");
        setIntField(term204670, term204670.getClass(), "isNetMember", -2037783207);
        setIntField(term204670, term204670.getClass(), "iconId", 799731049);
        setIntField(term204670, term204670.getClass(), "plateId", 1446415915);
        setIntField(term204670, term204670.getClass(), "titleId", 1616695923);
        setIntField(term204670, term204670.getClass(), "partnerId", -1952633376);
        setIntField(term204670, term204670.getClass(), "frameId", -2077418776);
        setIntField(term204670, term204670.getClass(), "selectMapId", 1888684596);
        setIntField(term204670, term204670.getClass(), "totalAwake", 1391968678);
        setIntField(term204670, term204670.getClass(), "gradeRating", -573573198);
        setIntField(term204670, term204670.getClass(), "musicRating", -721584808);
        setIntField(term204670, term204670.getClass(), "playerRating", 2146307582);
        setIntField(term204670, term204670.getClass(), "highestRating", 816418778);
        setIntField(term204670, term204670.getClass(), "gradeRank", -1343139679);
        setIntField(term204670, term204670.getClass(), "classRank", -1422276108);
        setIntField(term204670, term204670.getClass(), "courseRank", 629145097);
        setField(term204670, term204670.getClass(), "charaSlot", term204735);
        setField(term204670, term204670.getClass(), "charaLockSlot", term204745);
        setLongField(term204670, term204670.getClass(), "contentBit", 4984827162222228924L);
        setIntField(term204670, term204670.getClass(), "playCount", -1038526476);
        setField(term204670, term204670.getClass(), "eventWatchedDate", "ZZsQCEEVKE");
        setField(term204670, term204670.getClass(), "lastGameId", "hKBSHXXlvX");
        setField(term204670, term204670.getClass(), "lastRomVersion", "pZqmVVEcJR");
        setField(term204670, term204670.getClass(), "lastDataVersion", "vaYnGhiSYc");
        setField(term204670, term204670.getClass(), "lastLoginDate", "iCvpnoRweF");
        setField(term204670, term204670.getClass(), "lastPlayDate", "inQpmScxiy");
        setIntField(term204670, term204670.getClass(), "lastPlayCredit", -1620249948);
        setIntField(term204670, term204670.getClass(), "lastPlayMode", 407409382);
        setIntField(term204670, term204670.getClass(), "lastPlaceId", -434813900);
        setField(term204670, term204670.getClass(), "lastPlaceName", "pxviRKMdhZ");
        setIntField(term204670, term204670.getClass(), "lastAllNetId", -1591071874);
        setIntField(term204670, term204670.getClass(), "lastRegionId", -1309509159);
        setField(term204670, term204670.getClass(), "lastRegionName", "mzpZtwUvBH");
        setField(term204670, term204670.getClass(), "lastClientId", "vjGhzsSgdc");
        setField(term204670, term204670.getClass(), "lastCountryCode", "CrRdosOwUB");
        setIntField(term204670, term204670.getClass(), "lastSelectEMoney", 876797689);
        setIntField(term204670, term204670.getClass(), "lastSelectTicket", -851468449);
        setIntField(term204670, term204670.getClass(), "lastSelectCourse", -1514712203);
        setIntField(term204670, term204670.getClass(), "lastCountCourse", 1598781132);
        setField(term204670, term204670.getClass(), "firstGameId", "pRlplVwvQY");
        setField(term204670, term204670.getClass(), "firstRomVersion", "UqVSwrKROE");
        setField(term204670, term204670.getClass(), "firstDataVersion", "UmMuZdvRme");
        setField(term204670, term204670.getClass(), "firstPlayDate", "EQXkjUFyjP");
        setField(term204670, term204670.getClass(), "compatibleCmVersion", "DryaIkTsAU");
        setField(term204670, term204670.getClass(), "dailyBonusDate", "yepnxnHDdp");
        setField(term204670, term204670.getClass(), "dailyCourseBonusDate", "pxILvBKWRo");
        setField(term204670, term204670.getClass(), "lastPairLoginDate", "OrMrzSscwB");
        setField(term204670, term204670.getClass(), "lastTrialPlayDate", "qOiZVTUasG");
        setIntField(term204670, term204670.getClass(), "playVsCount", 1899169938);
        setIntField(term204670, term204670.getClass(), "playSyncCount", 2086291792);
        setIntField(term204670, term204670.getClass(), "winCount", -1433187744);
        setIntField(term204670, term204670.getClass(), "helpCount", 1762255097);
        setIntField(term204670, term204670.getClass(), "comboCount", 888018912);
        setLongField(term204670, term204670.getClass(), "totalDeluxscore", -4977729913285104357L);
        setLongField(term204670, term204670.getClass(), "totalBasicDeluxscore", -7632402404509832308L);
        setLongField(term204670, term204670.getClass(), "totalAdvancedDeluxscore", 4147344134637411052L);
        setLongField(term204670, term204670.getClass(), "totalExpertDeluxscore", -5721314969496372665L);
        setLongField(term204670, term204670.getClass(), "totalMasterDeluxscore", 3145258254248365850L);
        setLongField(term204670, term204670.getClass(), "totalReMasterDeluxscore", -6960693994602911362L);
        setIntField(term204670, term204670.getClass(), "totalSync", 856692442);
        setIntField(term204670, term204670.getClass(), "totalBasicSync", -2001484892);
        setIntField(term204670, term204670.getClass(), "totalAdvancedSync", -196301425);
        setIntField(term204670, term204670.getClass(), "totalExpertSync", 1709968466);
        setIntField(term204670, term204670.getClass(), "totalMasterSync", 1751184955);
        setIntField(term204670, term204670.getClass(), "totalReMasterSync", 1782993942);
        setLongField(term204670, term204670.getClass(), "totalAchievement", -2677397085138664479L);
        setLongField(term204670, term204670.getClass(), "totalBasicAchievement", 5853848687282756413L);
        setLongField(term204670, term204670.getClass(), "totalAdvancedAchievement", 4438254867600550639L);
        setLongField(term204670, term204670.getClass(), "totalExpertAchievement", 8051628118406926225L);
        setLongField(term204670, term204670.getClass(), "totalMasterAchievement", 7808475277288474254L);
        setLongField(term204670, term204670.getClass(), "totalReMasterAchievement", -4931395592119755702L);
        setLongField(term204670, term204670.getClass(), "playerOldRating", -3467617408797888248L);
        setLongField(term204670, term204670.getClass(), "playerNewRating", 7425258440383487233L);
        setIntField(term204670, term204670.getClass(), "banState", 963677814);
        setLongField(term204670, term204670.getClass(), "dateTime", -3029001302245362106L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassRank", argTypes, term204670, args);
    }

};


