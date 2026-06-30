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

public class UserCharacter_getUser_13467501562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185699;

    public UserCharacter_getUser_13467501562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185705 = new Long(3746481521207337771L);
        Integer term185768 = new Integer(1863609082);
        Integer term185770 = new Integer(346023694);
        Integer term185772 = new Integer(1378096239);
        Integer term185774 = new Integer(-1082231594);
        Integer term185776 = new Integer(-1775141108);
        Integer term185778 = new Integer(-606500993);
        Integer term185780 = new Integer(475994339);
        Integer term185782 = new Integer(-460066219);
        Integer term185784 = new Integer(-1947540595);
        ArrayList term185766 = new ArrayList();
        ((ArrayList) term185766).add(term185768);
        ((ArrayList) term185766).add(term185770);
        ((ArrayList) term185766).add(term185772);
        ((ArrayList) term185766).add(term185774);
        ((ArrayList) term185766).add(term185776);
        ((ArrayList) term185766).add(term185778);
        ((ArrayList) term185766).add(term185780);
        ((ArrayList) term185766).add(term185782);
        ((ArrayList) term185766).add(term185784);
        Integer term185790 = new Integer(-1198145043);
        Integer term185792 = new Integer(-999740641);
        ArrayList term185788 = new ArrayList();
        ((ArrayList) term185788).add(term185790);
        ((ArrayList) term185788).add(term185792);
        term185699 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term185701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term185703 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185724 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185734 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185699, term185699.getClass(), "id", -4195585882125852631L);
        setLongField(term185701, term185701.getClass(), "id", -7771426303082571181L);
        setLongField(term185703, term185703.getClass(), "id", -461329147930703249L);
        setField(term185703, term185703.getClass(), "extId", term185705);
        setField(term185703, term185703.getClass(), "luid", "rCUCVDsyQP");
        setIntField(term185720, term185720.getClass(), "year", 2017);
        setShortField(term185720, term185720.getClass(), "month", (short) 7);
        setShortField(term185720, term185720.getClass(), "day", (short) 24);
        setField(term185719, term185719.getClass(), "date", term185720);
        setByteField(term185724, term185724.getClass(), "hour", (byte) 3);
        setByteField(term185724, term185724.getClass(), "minute", (byte) 55);
        setByteField(term185724, term185724.getClass(), "second", (byte) 40);
        setIntField(term185724, term185724.getClass(), "nano", 397924395);
        setField(term185719, term185719.getClass(), "time", term185724);
        setField(term185703, term185703.getClass(), "registerTime", term185719);
        setIntField(term185730, term185730.getClass(), "year", 2019);
        setShortField(term185730, term185730.getClass(), "month", (short) 1);
        setShortField(term185730, term185730.getClass(), "day", (short) 4);
        setField(term185729, term185729.getClass(), "date", term185730);
        setByteField(term185734, term185734.getClass(), "hour", (byte) 6);
        setByteField(term185734, term185734.getClass(), "minute", (byte) 53);
        setByteField(term185734, term185734.getClass(), "second", (byte) 23);
        setIntField(term185734, term185734.getClass(), "nano", 416630544);
        setField(term185729, term185729.getClass(), "time", term185734);
        setField(term185703, term185703.getClass(), "accessTime", term185729);
        setField(term185701, term185701.getClass(), "card", term185703);
        setField(term185701, term185701.getClass(), "userName", "zjPsshCNVy");
        setIntField(term185701, term185701.getClass(), "isNetMember", -2053674332);
        setIntField(term185701, term185701.getClass(), "iconId", 1511770563);
        setIntField(term185701, term185701.getClass(), "plateId", -1328010620);
        setIntField(term185701, term185701.getClass(), "titleId", -1706269085);
        setIntField(term185701, term185701.getClass(), "partnerId", 2015694273);
        setIntField(term185701, term185701.getClass(), "frameId", 1833181237);
        setIntField(term185701, term185701.getClass(), "selectMapId", -433780886);
        setIntField(term185701, term185701.getClass(), "totalAwake", -1646127961);
        setIntField(term185701, term185701.getClass(), "gradeRating", -2022896330);
        setIntField(term185701, term185701.getClass(), "musicRating", -374957299);
        setIntField(term185701, term185701.getClass(), "playerRating", 500378867);
        setIntField(term185701, term185701.getClass(), "highestRating", 455556049);
        setIntField(term185701, term185701.getClass(), "gradeRank", 509928046);
        setIntField(term185701, term185701.getClass(), "classRank", 40043535);
        setIntField(term185701, term185701.getClass(), "courseRank", 2042043397);
        setField(term185701, term185701.getClass(), "charaSlot", term185766);
        setField(term185701, term185701.getClass(), "charaLockSlot", term185788);
        setLongField(term185701, term185701.getClass(), "contentBit", -8366220047794225218L);
        setIntField(term185701, term185701.getClass(), "playCount", -1390880191);
        setField(term185701, term185701.getClass(), "eventWatchedDate", "DRCHHWDnEN");
        setField(term185701, term185701.getClass(), "lastGameId", "EvkrAYYQdd");
        setField(term185701, term185701.getClass(), "lastRomVersion", "ecpuRvtEYD");
        setField(term185701, term185701.getClass(), "lastDataVersion", "DoOdWGphdi");
        setField(term185701, term185701.getClass(), "lastLoginDate", "oLrpPSByjw");
        setField(term185701, term185701.getClass(), "lastPlayDate", "SZgtAalZXH");
        setIntField(term185701, term185701.getClass(), "lastPlayCredit", 733084027);
        setIntField(term185701, term185701.getClass(), "lastPlayMode", 1314581727);
        setIntField(term185701, term185701.getClass(), "lastPlaceId", 759320528);
        setField(term185701, term185701.getClass(), "lastPlaceName", "yRAXrykXQM");
        setIntField(term185701, term185701.getClass(), "lastAllNetId", 982876717);
        setIntField(term185701, term185701.getClass(), "lastRegionId", -321180122);
        setField(term185701, term185701.getClass(), "lastRegionName", "XHZWMGtcXo");
        setField(term185701, term185701.getClass(), "lastClientId", "ofKwawJquL");
        setField(term185701, term185701.getClass(), "lastCountryCode", "oXAHnAQLXO");
        setIntField(term185701, term185701.getClass(), "lastSelectEMoney", 1762912383);
        setIntField(term185701, term185701.getClass(), "lastSelectTicket", -1154329859);
        setIntField(term185701, term185701.getClass(), "lastSelectCourse", 719722692);
        setIntField(term185701, term185701.getClass(), "lastCountCourse", -1788049849);
        setField(term185701, term185701.getClass(), "firstGameId", "hRAbNXbihs");
        setField(term185701, term185701.getClass(), "firstRomVersion", "pBhsNcDwjq");
        setField(term185701, term185701.getClass(), "firstDataVersion", "KlCILqBuzi");
        setField(term185701, term185701.getClass(), "firstPlayDate", "jrXwpZtXQd");
        setField(term185701, term185701.getClass(), "compatibleCmVersion", "YiUhIkzvfS");
        setField(term185701, term185701.getClass(), "dailyBonusDate", "bsUiwCzIyy");
        setField(term185701, term185701.getClass(), "dailyCourseBonusDate", "lJgySfFWtA");
        setField(term185701, term185701.getClass(), "lastPairLoginDate", "ErZOzqPTwr");
        setField(term185701, term185701.getClass(), "lastTrialPlayDate", "LDVdMfqhmz");
        setIntField(term185701, term185701.getClass(), "playVsCount", -742041322);
        setIntField(term185701, term185701.getClass(), "playSyncCount", -671124441);
        setIntField(term185701, term185701.getClass(), "winCount", 938533783);
        setIntField(term185701, term185701.getClass(), "helpCount", -1125401257);
        setIntField(term185701, term185701.getClass(), "comboCount", -2142317069);
        setLongField(term185701, term185701.getClass(), "totalDeluxscore", 5938335049432738507L);
        setLongField(term185701, term185701.getClass(), "totalBasicDeluxscore", 8101424453166597716L);
        setLongField(term185701, term185701.getClass(), "totalAdvancedDeluxscore", -3794905176195309921L);
        setLongField(term185701, term185701.getClass(), "totalExpertDeluxscore", -3977066406545237877L);
        setLongField(term185701, term185701.getClass(), "totalMasterDeluxscore", 4050545655807589401L);
        setLongField(term185701, term185701.getClass(), "totalReMasterDeluxscore", 1419799849423868495L);
        setIntField(term185701, term185701.getClass(), "totalSync", 2015219082);
        setIntField(term185701, term185701.getClass(), "totalBasicSync", 516261940);
        setIntField(term185701, term185701.getClass(), "totalAdvancedSync", 894530883);
        setIntField(term185701, term185701.getClass(), "totalExpertSync", -534745648);
        setIntField(term185701, term185701.getClass(), "totalMasterSync", -484797447);
        setIntField(term185701, term185701.getClass(), "totalReMasterSync", 2029445652);
        setLongField(term185701, term185701.getClass(), "totalAchievement", 2530677345139764372L);
        setLongField(term185701, term185701.getClass(), "totalBasicAchievement", 6854410637631093763L);
        setLongField(term185701, term185701.getClass(), "totalAdvancedAchievement", -2684937579371181761L);
        setLongField(term185701, term185701.getClass(), "totalExpertAchievement", -5478802546630413879L);
        setLongField(term185701, term185701.getClass(), "totalMasterAchievement", -567503879183114756L);
        setLongField(term185701, term185701.getClass(), "totalReMasterAchievement", 3600842501953108737L);
        setLongField(term185701, term185701.getClass(), "playerOldRating", -8383951510031878518L);
        setLongField(term185701, term185701.getClass(), "playerNewRating", -5592861993594218992L);
        setIntField(term185701, term185701.getClass(), "banState", 849617026);
        setLongField(term185701, term185701.getClass(), "dateTime", -7307957496922433051L);
        setField(term185699, term185699.getClass(), "user", term185701);
        setIntField(term185699, term185699.getClass(), "characterId", 300829018);
        setIntField(term185699, term185699.getClass(), "level", -691347179);
        setIntField(term185699, term185699.getClass(), "awakening", 1092735670);
        setIntField(term185699, term185699.getClass(), "useCount", -259065495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term185699, args);
    }

};


