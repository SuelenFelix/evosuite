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

public class UserExtend_isPhotoAgree_205642125110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147330;

    public UserExtend_isPhotoAgree_205642125110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147336 = new Long(-6394943900800506753L);
        Integer term147399 = new Integer(2130990985);
        Integer term147401 = new Integer(523197189);
        Integer term147403 = new Integer(658684460);
        ArrayList term147397 = new ArrayList();
        ((ArrayList) term147397).add(term147399);
        ((ArrayList) term147397).add(term147401);
        ((ArrayList) term147397).add(term147403);
        Integer term147409 = new Integer(2073367039);
        Integer term147411 = new Integer(-365877126);
        ArrayList term147407 = new ArrayList();
        ((ArrayList) term147407).add(term147409);
        ((ArrayList) term147407).add(term147411);
        Integer term147695 = new Integer(251018856);
        Integer term147697 = new Integer(-1965331640);
        Integer term147699 = new Integer(-514392629);
        Integer term147701 = new Integer(-166633123);
        Integer term147703 = new Integer(373110517);
        Integer term147705 = new Integer(-1632703926);
        ArrayList term147693 = new ArrayList();
        ((ArrayList) term147693).add(term147695);
        ((ArrayList) term147693).add(term147697);
        ((ArrayList) term147693).add(term147699);
        ((ArrayList) term147693).add(term147701);
        ((ArrayList) term147693).add(term147703);
        ((ArrayList) term147693).add(term147705);
        ArrayList term147709 = new ArrayList();
        term147330 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term147332 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term147334 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147365 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147330, term147330.getClass(), "id", 2910693334335298676L);
        setLongField(term147332, term147332.getClass(), "id", 8755288460008217225L);
        setLongField(term147334, term147334.getClass(), "id", 2493585568664728037L);
        setField(term147334, term147334.getClass(), "extId", term147336);
        setField(term147334, term147334.getClass(), "luid", "XcNzjytYdo");
        setIntField(term147351, term147351.getClass(), "year", 2026);
        setShortField(term147351, term147351.getClass(), "month", (short) 10);
        setShortField(term147351, term147351.getClass(), "day", (short) 26);
        setField(term147350, term147350.getClass(), "date", term147351);
        setByteField(term147355, term147355.getClass(), "hour", (byte) 16);
        setByteField(term147355, term147355.getClass(), "minute", (byte) 45);
        setByteField(term147355, term147355.getClass(), "second", (byte) 43);
        setIntField(term147355, term147355.getClass(), "nano", 206234347);
        setField(term147350, term147350.getClass(), "time", term147355);
        setField(term147334, term147334.getClass(), "registerTime", term147350);
        setIntField(term147361, term147361.getClass(), "year", 2024);
        setShortField(term147361, term147361.getClass(), "month", (short) 3);
        setShortField(term147361, term147361.getClass(), "day", (short) 27);
        setField(term147360, term147360.getClass(), "date", term147361);
        setByteField(term147365, term147365.getClass(), "hour", (byte) 23);
        setByteField(term147365, term147365.getClass(), "minute", (byte) 48);
        setByteField(term147365, term147365.getClass(), "second", (byte) 45);
        setIntField(term147365, term147365.getClass(), "nano", 181365728);
        setField(term147360, term147360.getClass(), "time", term147365);
        setField(term147334, term147334.getClass(), "accessTime", term147360);
        setField(term147332, term147332.getClass(), "card", term147334);
        setField(term147332, term147332.getClass(), "userName", "yaWHpyBtzq");
        setIntField(term147332, term147332.getClass(), "isNetMember", 1127804536);
        setIntField(term147332, term147332.getClass(), "iconId", 1755642591);
        setIntField(term147332, term147332.getClass(), "plateId", -1387996294);
        setIntField(term147332, term147332.getClass(), "titleId", -1638476156);
        setIntField(term147332, term147332.getClass(), "partnerId", 507935099);
        setIntField(term147332, term147332.getClass(), "frameId", -2108922856);
        setIntField(term147332, term147332.getClass(), "selectMapId", -1519649466);
        setIntField(term147332, term147332.getClass(), "totalAwake", 2110120015);
        setIntField(term147332, term147332.getClass(), "gradeRating", 358085307);
        setIntField(term147332, term147332.getClass(), "musicRating", -1882759029);
        setIntField(term147332, term147332.getClass(), "playerRating", 2092751533);
        setIntField(term147332, term147332.getClass(), "highestRating", -873250381);
        setIntField(term147332, term147332.getClass(), "gradeRank", -1955087186);
        setIntField(term147332, term147332.getClass(), "classRank", -2090744011);
        setIntField(term147332, term147332.getClass(), "courseRank", 950263148);
        setField(term147332, term147332.getClass(), "charaSlot", term147397);
        setField(term147332, term147332.getClass(), "charaLockSlot", term147407);
        setLongField(term147332, term147332.getClass(), "contentBit", -6843345036415016112L);
        setIntField(term147332, term147332.getClass(), "playCount", 1645449673);
        setField(term147332, term147332.getClass(), "eventWatchedDate", "avheFeRlbW");
        setField(term147332, term147332.getClass(), "lastGameId", "tOwnGveRxa");
        setField(term147332, term147332.getClass(), "lastRomVersion", "poFpgGCWFn");
        setField(term147332, term147332.getClass(), "lastDataVersion", "RqdyWjrKTf");
        setField(term147332, term147332.getClass(), "lastLoginDate", "rWmZbuScqX");
        setField(term147332, term147332.getClass(), "lastPlayDate", "TjNFMlAPjg");
        setIntField(term147332, term147332.getClass(), "lastPlayCredit", 1957437059);
        setIntField(term147332, term147332.getClass(), "lastPlayMode", -1221331782);
        setIntField(term147332, term147332.getClass(), "lastPlaceId", 1348836087);
        setField(term147332, term147332.getClass(), "lastPlaceName", "RtwermybyK");
        setIntField(term147332, term147332.getClass(), "lastAllNetId", 1630454207);
        setIntField(term147332, term147332.getClass(), "lastRegionId", 1907518379);
        setField(term147332, term147332.getClass(), "lastRegionName", "viHGfcpsVu");
        setField(term147332, term147332.getClass(), "lastClientId", "UGKENyzPxk");
        setField(term147332, term147332.getClass(), "lastCountryCode", "xsGPsLxzxW");
        setIntField(term147332, term147332.getClass(), "lastSelectEMoney", -956090724);
        setIntField(term147332, term147332.getClass(), "lastSelectTicket", -34786917);
        setIntField(term147332, term147332.getClass(), "lastSelectCourse", 383524147);
        setIntField(term147332, term147332.getClass(), "lastCountCourse", 1103536027);
        setField(term147332, term147332.getClass(), "firstGameId", "XoKkEYIzVX");
        setField(term147332, term147332.getClass(), "firstRomVersion", "rtKwDvMEWe");
        setField(term147332, term147332.getClass(), "firstDataVersion", "FjPjLYxYCD");
        setField(term147332, term147332.getClass(), "firstPlayDate", "MVKJWagTKW");
        setField(term147332, term147332.getClass(), "compatibleCmVersion", "JrgxSjdHDm");
        setField(term147332, term147332.getClass(), "dailyBonusDate", "oYTaCsZgHc");
        setField(term147332, term147332.getClass(), "dailyCourseBonusDate", "JjbnWzssdi");
        setField(term147332, term147332.getClass(), "lastPairLoginDate", "JBjRYdrxgs");
        setField(term147332, term147332.getClass(), "lastTrialPlayDate", "SGDHQYYzsR");
        setIntField(term147332, term147332.getClass(), "playVsCount", -387893846);
        setIntField(term147332, term147332.getClass(), "playSyncCount", -297741338);
        setIntField(term147332, term147332.getClass(), "winCount", 206404549);
        setIntField(term147332, term147332.getClass(), "helpCount", 1164079567);
        setIntField(term147332, term147332.getClass(), "comboCount", 808653750);
        setLongField(term147332, term147332.getClass(), "totalDeluxscore", -8536264410511389781L);
        setLongField(term147332, term147332.getClass(), "totalBasicDeluxscore", 2278753731601146162L);
        setLongField(term147332, term147332.getClass(), "totalAdvancedDeluxscore", -437841662957220916L);
        setLongField(term147332, term147332.getClass(), "totalExpertDeluxscore", 6551035127004284776L);
        setLongField(term147332, term147332.getClass(), "totalMasterDeluxscore", 2466322345106159600L);
        setLongField(term147332, term147332.getClass(), "totalReMasterDeluxscore", -8623104319921854362L);
        setIntField(term147332, term147332.getClass(), "totalSync", -1440143802);
        setIntField(term147332, term147332.getClass(), "totalBasicSync", 2128836583);
        setIntField(term147332, term147332.getClass(), "totalAdvancedSync", 1644897809);
        setIntField(term147332, term147332.getClass(), "totalExpertSync", 1814048906);
        setIntField(term147332, term147332.getClass(), "totalMasterSync", -113356049);
        setIntField(term147332, term147332.getClass(), "totalReMasterSync", 1523433206);
        setLongField(term147332, term147332.getClass(), "totalAchievement", 7573781195243219744L);
        setLongField(term147332, term147332.getClass(), "totalBasicAchievement", 4940171539291834175L);
        setLongField(term147332, term147332.getClass(), "totalAdvancedAchievement", 4816320856471117777L);
        setLongField(term147332, term147332.getClass(), "totalExpertAchievement", -7314994900652238009L);
        setLongField(term147332, term147332.getClass(), "totalMasterAchievement", 8488448320191878689L);
        setLongField(term147332, term147332.getClass(), "totalReMasterAchievement", -2863975035862603271L);
        setLongField(term147332, term147332.getClass(), "playerOldRating", -4010115214041392545L);
        setLongField(term147332, term147332.getClass(), "playerNewRating", 611991742338882331L);
        setIntField(term147332, term147332.getClass(), "banState", -353002245);
        setLongField(term147332, term147332.getClass(), "dateTime", -4762684541771747375L);
        setField(term147330, term147330.getClass(), "user", term147332);
        setIntField(term147330, term147330.getClass(), "selectMusicId", 1307822619);
        setIntField(term147330, term147330.getClass(), "selectDifficultyId", -1218971646);
        setIntField(term147330, term147330.getClass(), "categoryIndex", 1826082446);
        setIntField(term147330, term147330.getClass(), "musicIndex", 683436217);
        setIntField(term147330, term147330.getClass(), "extraFlag", -453252097);
        setIntField(term147330, term147330.getClass(), "selectScoreType", 881546219);
        setLongField(term147330, term147330.getClass(), "extendContentBit", -6876300710628578528L);
        setBooleanField(term147330, term147330.getClass(), "isPhotoAgree", false);
        setBooleanField(term147330, term147330.getClass(), "isGotoCodeRead", true);
        setBooleanField(term147330, term147330.getClass(), "selectResultDetails", true);
        setIntField(term147330, term147330.getClass(), "sortCategorySetting", 1102295833);
        setIntField(term147330, term147330.getClass(), "sortMusicSetting", -1680086509);
        setField(term147330, term147330.getClass(), "selectedCardList", term147693);
        setField(term147330, term147330.getClass(), "encountMapNpcList", term147709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPhotoAgree", argTypes, term147330, args);
    }

};


