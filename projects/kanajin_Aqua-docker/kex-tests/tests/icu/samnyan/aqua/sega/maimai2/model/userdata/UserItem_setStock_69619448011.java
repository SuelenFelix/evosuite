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

public class UserItem_setStock_69619448011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39789;
     Object term40154;

    public UserItem_setStock_69619448011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39795 = new Long(5953383087795962419L);
        Integer term39858 = new Integer(550892835);
        Integer term39860 = new Integer(1237549886);
        Integer term39862 = new Integer(-1945635750);
        Integer term39864 = new Integer(-1622760744);
        ArrayList term39856 = new ArrayList();
        ((ArrayList) term39856).add(term39858);
        ((ArrayList) term39856).add(term39860);
        ((ArrayList) term39856).add(term39862);
        ((ArrayList) term39856).add(term39864);
        Integer term39870 = new Integer(2068435279);
        Integer term39872 = new Integer(-1556527718);
        Integer term39874 = new Integer(895255351);
        Integer term39876 = new Integer(-1317044799);
        Integer term39878 = new Integer(-1428063820);
        Integer term39880 = new Integer(-1271375703);
        ArrayList term39868 = new ArrayList();
        ((ArrayList) term39868).add(term39870);
        ((ArrayList) term39868).add(term39872);
        ((ArrayList) term39868).add(term39874);
        ((ArrayList) term39868).add(term39876);
        ((ArrayList) term39868).add(term39878);
        ((ArrayList) term39868).add(term39880);
        term39789 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term39791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term39793 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39824 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39789, term39789.getClass(), "id", 753843644992595899L);
        setLongField(term39791, term39791.getClass(), "id", -2035876674935124725L);
        setLongField(term39793, term39793.getClass(), "id", 4961271045442602009L);
        setField(term39793, term39793.getClass(), "extId", term39795);
        setField(term39793, term39793.getClass(), "luid", "cAObIvLmLo");
        setIntField(term39810, term39810.getClass(), "year", 2026);
        setShortField(term39810, term39810.getClass(), "month", (short) 6);
        setShortField(term39810, term39810.getClass(), "day", (short) 13);
        setField(term39809, term39809.getClass(), "date", term39810);
        setByteField(term39814, term39814.getClass(), "hour", (byte) 19);
        setByteField(term39814, term39814.getClass(), "minute", (byte) 23);
        setByteField(term39814, term39814.getClass(), "second", (byte) 46);
        setIntField(term39814, term39814.getClass(), "nano", 67955056);
        setField(term39809, term39809.getClass(), "time", term39814);
        setField(term39793, term39793.getClass(), "registerTime", term39809);
        setIntField(term39820, term39820.getClass(), "year", 2013);
        setShortField(term39820, term39820.getClass(), "month", (short) 12);
        setShortField(term39820, term39820.getClass(), "day", (short) 23);
        setField(term39819, term39819.getClass(), "date", term39820);
        setByteField(term39824, term39824.getClass(), "hour", (byte) 1);
        setByteField(term39824, term39824.getClass(), "minute", (byte) 0);
        setByteField(term39824, term39824.getClass(), "second", (byte) 32);
        setIntField(term39824, term39824.getClass(), "nano", 168525686);
        setField(term39819, term39819.getClass(), "time", term39824);
        setField(term39793, term39793.getClass(), "accessTime", term39819);
        setField(term39791, term39791.getClass(), "card", term39793);
        setField(term39791, term39791.getClass(), "userName", "xwiCqRSWSe");
        setIntField(term39791, term39791.getClass(), "isNetMember", -929524036);
        setIntField(term39791, term39791.getClass(), "iconId", 1539575963);
        setIntField(term39791, term39791.getClass(), "plateId", -381662221);
        setIntField(term39791, term39791.getClass(), "titleId", -1367263864);
        setIntField(term39791, term39791.getClass(), "partnerId", 1810292112);
        setIntField(term39791, term39791.getClass(), "frameId", 385619995);
        setIntField(term39791, term39791.getClass(), "selectMapId", -920852160);
        setIntField(term39791, term39791.getClass(), "totalAwake", -1975385844);
        setIntField(term39791, term39791.getClass(), "gradeRating", -720629032);
        setIntField(term39791, term39791.getClass(), "musicRating", 398554038);
        setIntField(term39791, term39791.getClass(), "playerRating", -1454206593);
        setIntField(term39791, term39791.getClass(), "highestRating", 675396436);
        setIntField(term39791, term39791.getClass(), "gradeRank", -41963319);
        setIntField(term39791, term39791.getClass(), "classRank", -831752810);
        setIntField(term39791, term39791.getClass(), "courseRank", -386141354);
        setField(term39791, term39791.getClass(), "charaSlot", term39856);
        setField(term39791, term39791.getClass(), "charaLockSlot", term39868);
        setLongField(term39791, term39791.getClass(), "contentBit", 8143748492411850558L);
        setIntField(term39791, term39791.getClass(), "playCount", -226677391);
        setField(term39791, term39791.getClass(), "eventWatchedDate", "IbUFkzIgzq");
        setField(term39791, term39791.getClass(), "lastGameId", "dTOUSTDdbw");
        setField(term39791, term39791.getClass(), "lastRomVersion", "PECfBejlfo");
        setField(term39791, term39791.getClass(), "lastDataVersion", "SDbDgydVpg");
        setField(term39791, term39791.getClass(), "lastLoginDate", "EEMaiNkiOH");
        setField(term39791, term39791.getClass(), "lastPlayDate", "sFdmTylvqh");
        setIntField(term39791, term39791.getClass(), "lastPlayCredit", -1991945298);
        setIntField(term39791, term39791.getClass(), "lastPlayMode", 110090057);
        setIntField(term39791, term39791.getClass(), "lastPlaceId", 1975165299);
        setField(term39791, term39791.getClass(), "lastPlaceName", "rgniLaOaiz");
        setIntField(term39791, term39791.getClass(), "lastAllNetId", -1320712215);
        setIntField(term39791, term39791.getClass(), "lastRegionId", -619414497);
        setField(term39791, term39791.getClass(), "lastRegionName", "fzQzzdIOMC");
        setField(term39791, term39791.getClass(), "lastClientId", "hLVDOhfCKX");
        setField(term39791, term39791.getClass(), "lastCountryCode", "yXLTfzOgfX");
        setIntField(term39791, term39791.getClass(), "lastSelectEMoney", 1414603242);
        setIntField(term39791, term39791.getClass(), "lastSelectTicket", 18596324);
        setIntField(term39791, term39791.getClass(), "lastSelectCourse", 907968883);
        setIntField(term39791, term39791.getClass(), "lastCountCourse", -1191329679);
        setField(term39791, term39791.getClass(), "firstGameId", "MANlfBKTPY");
        setField(term39791, term39791.getClass(), "firstRomVersion", "mRoEmuCJhW");
        setField(term39791, term39791.getClass(), "firstDataVersion", "JJUWbMXpyM");
        setField(term39791, term39791.getClass(), "firstPlayDate", "KDrRQWVXok");
        setField(term39791, term39791.getClass(), "compatibleCmVersion", "oOOwvWgxtf");
        setField(term39791, term39791.getClass(), "dailyBonusDate", "ywoADeiUfF");
        setField(term39791, term39791.getClass(), "dailyCourseBonusDate", "loHiudJxbt");
        setField(term39791, term39791.getClass(), "lastPairLoginDate", "lRbxbybNew");
        setField(term39791, term39791.getClass(), "lastTrialPlayDate", "WzGudiEARD");
        setIntField(term39791, term39791.getClass(), "playVsCount", -937626498);
        setIntField(term39791, term39791.getClass(), "playSyncCount", 398974629);
        setIntField(term39791, term39791.getClass(), "winCount", -790946306);
        setIntField(term39791, term39791.getClass(), "helpCount", -189980304);
        setIntField(term39791, term39791.getClass(), "comboCount", 1492044959);
        setLongField(term39791, term39791.getClass(), "totalDeluxscore", 3834297266838969495L);
        setLongField(term39791, term39791.getClass(), "totalBasicDeluxscore", -3257831489581525693L);
        setLongField(term39791, term39791.getClass(), "totalAdvancedDeluxscore", 273141122717896399L);
        setLongField(term39791, term39791.getClass(), "totalExpertDeluxscore", 4057255693458933280L);
        setLongField(term39791, term39791.getClass(), "totalMasterDeluxscore", 3365899934091025813L);
        setLongField(term39791, term39791.getClass(), "totalReMasterDeluxscore", 8532808243879007296L);
        setIntField(term39791, term39791.getClass(), "totalSync", 260483962);
        setIntField(term39791, term39791.getClass(), "totalBasicSync", 1115251191);
        setIntField(term39791, term39791.getClass(), "totalAdvancedSync", 1882224203);
        setIntField(term39791, term39791.getClass(), "totalExpertSync", 1320826206);
        setIntField(term39791, term39791.getClass(), "totalMasterSync", -933702401);
        setIntField(term39791, term39791.getClass(), "totalReMasterSync", 1670477259);
        setLongField(term39791, term39791.getClass(), "totalAchievement", 3757985447600693853L);
        setLongField(term39791, term39791.getClass(), "totalBasicAchievement", 7118424169978013558L);
        setLongField(term39791, term39791.getClass(), "totalAdvancedAchievement", 1145539328952774873L);
        setLongField(term39791, term39791.getClass(), "totalExpertAchievement", -4593197356529163455L);
        setLongField(term39791, term39791.getClass(), "totalMasterAchievement", -8449554760304422682L);
        setLongField(term39791, term39791.getClass(), "totalReMasterAchievement", -8538697616110187183L);
        setLongField(term39791, term39791.getClass(), "playerOldRating", -1177978844927364440L);
        setLongField(term39791, term39791.getClass(), "playerNewRating", -2253606887164749750L);
        setIntField(term39791, term39791.getClass(), "banState", 186917839);
        setLongField(term39791, term39791.getClass(), "dateTime", 8324238777146638579L);
        setField(term39789, term39789.getClass(), "user", term39791);
        setIntField(term39789, term39789.getClass(), "itemKind", 1727889509);
        setIntField(term39789, term39789.getClass(), "itemId", -159961860);
        setIntField(term39789, term39789.getClass(), "stock", -1656685141);
        setBooleanField(term39789, term39789.getClass(), "isValid", true);
        term40154 = new Integer(-1550347560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40154;
        callMethod(klass, "setStock", argTypes, term39789, args);
    }

};


