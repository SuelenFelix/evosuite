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

public class UserUdemae_init_14504032490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94329;

    public UserUdemae_init_14504032490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94333 = new Long(138235087558060686L);
        Integer term94396 = new Integer(750084083);
        Integer term94398 = new Integer(-1603460382);
        Integer term94400 = new Integer(-298939768);
        Integer term94402 = new Integer(-767031634);
        Integer term94404 = new Integer(-2072469750);
        Integer term94406 = new Integer(2106616847);
        Integer term94408 = new Integer(403107947);
        Integer term94410 = new Integer(-1433815725);
        ArrayList term94394 = new ArrayList();
        ((ArrayList) term94394).add(term94396);
        ((ArrayList) term94394).add(term94398);
        ((ArrayList) term94394).add(term94400);
        ((ArrayList) term94394).add(term94402);
        ((ArrayList) term94394).add(term94404);
        ((ArrayList) term94394).add(term94406);
        ((ArrayList) term94394).add(term94408);
        ((ArrayList) term94394).add(term94410);
        Integer term94416 = new Integer(-1445089135);
        Integer term94418 = new Integer(-291618851);
        Integer term94420 = new Integer(-378436487);
        Integer term94422 = new Integer(584949609);
        ArrayList term94414 = new ArrayList();
        ((ArrayList) term94414).add(term94416);
        ((ArrayList) term94414).add(term94418);
        ((ArrayList) term94414).add(term94420);
        ((ArrayList) term94414).add(term94422);
        term94329 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term94331 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94352 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94329, term94329.getClass(), "id", 2657901217352946486L);
        setLongField(term94331, term94331.getClass(), "id", 1670347449784766585L);
        setField(term94331, term94331.getClass(), "extId", term94333);
        setField(term94331, term94331.getClass(), "luid", "CJBElYMXZF");
        setIntField(term94348, term94348.getClass(), "year", 2020);
        setShortField(term94348, term94348.getClass(), "month", (short) 4);
        setShortField(term94348, term94348.getClass(), "day", (short) 16);
        setField(term94347, term94347.getClass(), "date", term94348);
        setByteField(term94352, term94352.getClass(), "hour", (byte) 7);
        setByteField(term94352, term94352.getClass(), "minute", (byte) 46);
        setByteField(term94352, term94352.getClass(), "second", (byte) 47);
        setIntField(term94352, term94352.getClass(), "nano", 687690824);
        setField(term94347, term94347.getClass(), "time", term94352);
        setField(term94331, term94331.getClass(), "registerTime", term94347);
        setIntField(term94358, term94358.getClass(), "year", 2010);
        setShortField(term94358, term94358.getClass(), "month", (short) 7);
        setShortField(term94358, term94358.getClass(), "day", (short) 15);
        setField(term94357, term94357.getClass(), "date", term94358);
        setByteField(term94362, term94362.getClass(), "hour", (byte) 11);
        setByteField(term94362, term94362.getClass(), "minute", (byte) 28);
        setByteField(term94362, term94362.getClass(), "second", (byte) 5);
        setIntField(term94362, term94362.getClass(), "nano", 471613968);
        setField(term94357, term94357.getClass(), "time", term94362);
        setField(term94331, term94331.getClass(), "accessTime", term94357);
        setField(term94329, term94329.getClass(), "card", term94331);
        setField(term94329, term94329.getClass(), "userName", "uZOAWgAORh");
        setIntField(term94329, term94329.getClass(), "isNetMember", -653095451);
        setIntField(term94329, term94329.getClass(), "iconId", 1716408118);
        setIntField(term94329, term94329.getClass(), "plateId", -1873669731);
        setIntField(term94329, term94329.getClass(), "titleId", 2124411599);
        setIntField(term94329, term94329.getClass(), "partnerId", -71602583);
        setIntField(term94329, term94329.getClass(), "frameId", -1926082322);
        setIntField(term94329, term94329.getClass(), "selectMapId", 210448865);
        setIntField(term94329, term94329.getClass(), "totalAwake", 1795078195);
        setIntField(term94329, term94329.getClass(), "gradeRating", -118250608);
        setIntField(term94329, term94329.getClass(), "musicRating", -19855467);
        setIntField(term94329, term94329.getClass(), "playerRating", -381214484);
        setIntField(term94329, term94329.getClass(), "highestRating", 1908628900);
        setIntField(term94329, term94329.getClass(), "gradeRank", -254024426);
        setIntField(term94329, term94329.getClass(), "classRank", 2035106255);
        setIntField(term94329, term94329.getClass(), "courseRank", -65925181);
        setField(term94329, term94329.getClass(), "charaSlot", term94394);
        setField(term94329, term94329.getClass(), "charaLockSlot", term94414);
        setLongField(term94329, term94329.getClass(), "contentBit", -8326327936376570218L);
        setIntField(term94329, term94329.getClass(), "playCount", -134969175);
        setField(term94329, term94329.getClass(), "eventWatchedDate", "fmFvklptLM");
        setField(term94329, term94329.getClass(), "lastGameId", "CYfPHswxIT");
        setField(term94329, term94329.getClass(), "lastRomVersion", "IDibKvfdDt");
        setField(term94329, term94329.getClass(), "lastDataVersion", "sKLtBTAssF");
        setField(term94329, term94329.getClass(), "lastLoginDate", "ROGqSdboUf");
        setField(term94329, term94329.getClass(), "lastPlayDate", "NfGNgrTcyY");
        setIntField(term94329, term94329.getClass(), "lastPlayCredit", 985529917);
        setIntField(term94329, term94329.getClass(), "lastPlayMode", -1459510700);
        setIntField(term94329, term94329.getClass(), "lastPlaceId", -1060341148);
        setField(term94329, term94329.getClass(), "lastPlaceName", "uPuFIjvpsv");
        setIntField(term94329, term94329.getClass(), "lastAllNetId", 1931459176);
        setIntField(term94329, term94329.getClass(), "lastRegionId", 266090245);
        setField(term94329, term94329.getClass(), "lastRegionName", "zNKHFvTvNQ");
        setField(term94329, term94329.getClass(), "lastClientId", "cyqgSKerVH");
        setField(term94329, term94329.getClass(), "lastCountryCode", "KMFbAPDgQN");
        setIntField(term94329, term94329.getClass(), "lastSelectEMoney", 1329931034);
        setIntField(term94329, term94329.getClass(), "lastSelectTicket", -2040965607);
        setIntField(term94329, term94329.getClass(), "lastSelectCourse", 2056421741);
        setIntField(term94329, term94329.getClass(), "lastCountCourse", 473013403);
        setField(term94329, term94329.getClass(), "firstGameId", "pOXTylvole");
        setField(term94329, term94329.getClass(), "firstRomVersion", "kfguTpQAqI");
        setField(term94329, term94329.getClass(), "firstDataVersion", "YcPukufpJs");
        setField(term94329, term94329.getClass(), "firstPlayDate", "vvGshYKSpj");
        setField(term94329, term94329.getClass(), "compatibleCmVersion", "haqqYHJKqP");
        setField(term94329, term94329.getClass(), "dailyBonusDate", "pehbaguHxu");
        setField(term94329, term94329.getClass(), "dailyCourseBonusDate", "pcQcluzQgA");
        setField(term94329, term94329.getClass(), "lastPairLoginDate", "iWOGNdtCLH");
        setField(term94329, term94329.getClass(), "lastTrialPlayDate", "KoDRiNjUMj");
        setIntField(term94329, term94329.getClass(), "playVsCount", 139601586);
        setIntField(term94329, term94329.getClass(), "playSyncCount", 198201617);
        setIntField(term94329, term94329.getClass(), "winCount", -816938071);
        setIntField(term94329, term94329.getClass(), "helpCount", -703996658);
        setIntField(term94329, term94329.getClass(), "comboCount", -1472021518);
        setLongField(term94329, term94329.getClass(), "totalDeluxscore", 6004168776796799036L);
        setLongField(term94329, term94329.getClass(), "totalBasicDeluxscore", -2230737261489182178L);
        setLongField(term94329, term94329.getClass(), "totalAdvancedDeluxscore", -83935965733853204L);
        setLongField(term94329, term94329.getClass(), "totalExpertDeluxscore", -6117166524101089550L);
        setLongField(term94329, term94329.getClass(), "totalMasterDeluxscore", 2101866704361336078L);
        setLongField(term94329, term94329.getClass(), "totalReMasterDeluxscore", 8493341625422825183L);
        setIntField(term94329, term94329.getClass(), "totalSync", 1339815724);
        setIntField(term94329, term94329.getClass(), "totalBasicSync", 128296124);
        setIntField(term94329, term94329.getClass(), "totalAdvancedSync", 412002888);
        setIntField(term94329, term94329.getClass(), "totalExpertSync", -518326317);
        setIntField(term94329, term94329.getClass(), "totalMasterSync", 638898197);
        setIntField(term94329, term94329.getClass(), "totalReMasterSync", 377212022);
        setLongField(term94329, term94329.getClass(), "totalAchievement", -2269414119814498738L);
        setLongField(term94329, term94329.getClass(), "totalBasicAchievement", -7494870343001402650L);
        setLongField(term94329, term94329.getClass(), "totalAdvancedAchievement", -3147972350410788960L);
        setLongField(term94329, term94329.getClass(), "totalExpertAchievement", 4346251769204745723L);
        setLongField(term94329, term94329.getClass(), "totalMasterAchievement", 5888936271160716455L);
        setLongField(term94329, term94329.getClass(), "totalReMasterAchievement", 8507610962194526217L);
        setLongField(term94329, term94329.getClass(), "playerOldRating", 4405633700704963930L);
        setLongField(term94329, term94329.getClass(), "playerNewRating", -2839037457841740486L);
        setIntField(term94329, term94329.getClass(), "banState", 1288951867);
        setLongField(term94329, term94329.getClass(), "dateTime", -1513496915959494427L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term94329;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


