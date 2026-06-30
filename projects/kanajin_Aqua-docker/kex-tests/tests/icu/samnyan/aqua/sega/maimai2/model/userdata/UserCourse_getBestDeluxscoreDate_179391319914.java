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

public class UserCourse_getBestDeluxscoreDate_179391319914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80040;

    public UserCourse_getBestDeluxscoreDate_179391319914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term80046 = new Long(-1214968196781083707L);
        ArrayList term80107 = new ArrayList();
        Integer term80113 = new Integer(-235039141);
        Integer term80115 = new Integer(-1414233013);
        ArrayList term80111 = new ArrayList();
        ((ArrayList) term80111).add(term80113);
        ((ArrayList) term80111).add(term80115);
        term80040 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term80042 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term80044 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term80060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80075 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80040, term80040.getClass(), "id", -1514321226080897639L);
        setLongField(term80042, term80042.getClass(), "id", 3335901515267393294L);
        setLongField(term80044, term80044.getClass(), "id", 7450604331368897074L);
        setField(term80044, term80044.getClass(), "extId", term80046);
        setField(term80044, term80044.getClass(), "luid", "TWPJmzPTXg");
        setIntField(term80061, term80061.getClass(), "year", 2020);
        setShortField(term80061, term80061.getClass(), "month", (short) 10);
        setShortField(term80061, term80061.getClass(), "day", (short) 2);
        setField(term80060, term80060.getClass(), "date", term80061);
        setByteField(term80065, term80065.getClass(), "hour", (byte) 1);
        setByteField(term80065, term80065.getClass(), "minute", (byte) 41);
        setByteField(term80065, term80065.getClass(), "second", (byte) 48);
        setIntField(term80065, term80065.getClass(), "nano", 834720747);
        setField(term80060, term80060.getClass(), "time", term80065);
        setField(term80044, term80044.getClass(), "registerTime", term80060);
        setIntField(term80071, term80071.getClass(), "year", 2022);
        setShortField(term80071, term80071.getClass(), "month", (short) 3);
        setShortField(term80071, term80071.getClass(), "day", (short) 31);
        setField(term80070, term80070.getClass(), "date", term80071);
        setByteField(term80075, term80075.getClass(), "hour", (byte) 3);
        setByteField(term80075, term80075.getClass(), "minute", (byte) 43);
        setByteField(term80075, term80075.getClass(), "second", (byte) 28);
        setIntField(term80075, term80075.getClass(), "nano", 772790770);
        setField(term80070, term80070.getClass(), "time", term80075);
        setField(term80044, term80044.getClass(), "accessTime", term80070);
        setField(term80042, term80042.getClass(), "card", term80044);
        setField(term80042, term80042.getClass(), "userName", "frPgAZBkug");
        setIntField(term80042, term80042.getClass(), "isNetMember", 76618777);
        setIntField(term80042, term80042.getClass(), "iconId", 1705792936);
        setIntField(term80042, term80042.getClass(), "plateId", -1909996617);
        setIntField(term80042, term80042.getClass(), "titleId", -190426986);
        setIntField(term80042, term80042.getClass(), "partnerId", -555983707);
        setIntField(term80042, term80042.getClass(), "frameId", -606116015);
        setIntField(term80042, term80042.getClass(), "selectMapId", -181890457);
        setIntField(term80042, term80042.getClass(), "totalAwake", -944465027);
        setIntField(term80042, term80042.getClass(), "gradeRating", 378932740);
        setIntField(term80042, term80042.getClass(), "musicRating", -346858205);
        setIntField(term80042, term80042.getClass(), "playerRating", -1490019542);
        setIntField(term80042, term80042.getClass(), "highestRating", 681306470);
        setIntField(term80042, term80042.getClass(), "gradeRank", -1757429033);
        setIntField(term80042, term80042.getClass(), "classRank", -941018916);
        setIntField(term80042, term80042.getClass(), "courseRank", -200717429);
        setField(term80042, term80042.getClass(), "charaSlot", term80107);
        setField(term80042, term80042.getClass(), "charaLockSlot", term80111);
        setLongField(term80042, term80042.getClass(), "contentBit", 9082900970492935893L);
        setIntField(term80042, term80042.getClass(), "playCount", 1017751788);
        setField(term80042, term80042.getClass(), "eventWatchedDate", "AAzuYrqTRq");
        setField(term80042, term80042.getClass(), "lastGameId", "cUQuwEPzJb");
        setField(term80042, term80042.getClass(), "lastRomVersion", "sqPZeXSusM");
        setField(term80042, term80042.getClass(), "lastDataVersion", "mUCxMstoOT");
        setField(term80042, term80042.getClass(), "lastLoginDate", "LroMhmrHbv");
        setField(term80042, term80042.getClass(), "lastPlayDate", "nUWkEhozFC");
        setIntField(term80042, term80042.getClass(), "lastPlayCredit", 452190809);
        setIntField(term80042, term80042.getClass(), "lastPlayMode", -868819495);
        setIntField(term80042, term80042.getClass(), "lastPlaceId", -1011591867);
        setField(term80042, term80042.getClass(), "lastPlaceName", "cZOLUZUhxQ");
        setIntField(term80042, term80042.getClass(), "lastAllNetId", 709949296);
        setIntField(term80042, term80042.getClass(), "lastRegionId", 1078431447);
        setField(term80042, term80042.getClass(), "lastRegionName", "fXCybRqtsq");
        setField(term80042, term80042.getClass(), "lastClientId", "gPhmseJiob");
        setField(term80042, term80042.getClass(), "lastCountryCode", "dgpHJUBySN");
        setIntField(term80042, term80042.getClass(), "lastSelectEMoney", -894257039);
        setIntField(term80042, term80042.getClass(), "lastSelectTicket", 1586412497);
        setIntField(term80042, term80042.getClass(), "lastSelectCourse", 719020316);
        setIntField(term80042, term80042.getClass(), "lastCountCourse", 1522532191);
        setField(term80042, term80042.getClass(), "firstGameId", "jCEXysSVZf");
        setField(term80042, term80042.getClass(), "firstRomVersion", "jWrmcNnNoB");
        setField(term80042, term80042.getClass(), "firstDataVersion", "MoncgugUfo");
        setField(term80042, term80042.getClass(), "firstPlayDate", "OdbuOWCJTS");
        setField(term80042, term80042.getClass(), "compatibleCmVersion", "ksvfEdmpqg");
        setField(term80042, term80042.getClass(), "dailyBonusDate", "mNzFmmNjDi");
        setField(term80042, term80042.getClass(), "dailyCourseBonusDate", "UxkbStdccR");
        setField(term80042, term80042.getClass(), "lastPairLoginDate", "kizVhsjIpC");
        setField(term80042, term80042.getClass(), "lastTrialPlayDate", "uDuPkYdemJ");
        setIntField(term80042, term80042.getClass(), "playVsCount", 137516958);
        setIntField(term80042, term80042.getClass(), "playSyncCount", -1233770688);
        setIntField(term80042, term80042.getClass(), "winCount", 722935077);
        setIntField(term80042, term80042.getClass(), "helpCount", -304660297);
        setIntField(term80042, term80042.getClass(), "comboCount", 1530655970);
        setLongField(term80042, term80042.getClass(), "totalDeluxscore", -2789586359029154063L);
        setLongField(term80042, term80042.getClass(), "totalBasicDeluxscore", -8881948301533552645L);
        setLongField(term80042, term80042.getClass(), "totalAdvancedDeluxscore", -5901794166643398646L);
        setLongField(term80042, term80042.getClass(), "totalExpertDeluxscore", -7004623571860693586L);
        setLongField(term80042, term80042.getClass(), "totalMasterDeluxscore", -211624102263089228L);
        setLongField(term80042, term80042.getClass(), "totalReMasterDeluxscore", 4996387614529657386L);
        setIntField(term80042, term80042.getClass(), "totalSync", -154857398);
        setIntField(term80042, term80042.getClass(), "totalBasicSync", 385239631);
        setIntField(term80042, term80042.getClass(), "totalAdvancedSync", 836211088);
        setIntField(term80042, term80042.getClass(), "totalExpertSync", -365730201);
        setIntField(term80042, term80042.getClass(), "totalMasterSync", -1218078298);
        setIntField(term80042, term80042.getClass(), "totalReMasterSync", -1186533450);
        setLongField(term80042, term80042.getClass(), "totalAchievement", -1790513623283498924L);
        setLongField(term80042, term80042.getClass(), "totalBasicAchievement", -1912576404767694975L);
        setLongField(term80042, term80042.getClass(), "totalAdvancedAchievement", -647526387338349350L);
        setLongField(term80042, term80042.getClass(), "totalExpertAchievement", -5497138014320467810L);
        setLongField(term80042, term80042.getClass(), "totalMasterAchievement", 5731856064047201131L);
        setLongField(term80042, term80042.getClass(), "totalReMasterAchievement", 7405337470806099590L);
        setLongField(term80042, term80042.getClass(), "playerOldRating", 7098365422551787072L);
        setLongField(term80042, term80042.getClass(), "playerNewRating", 2683449026393099745L);
        setIntField(term80042, term80042.getClass(), "banState", 1385418235);
        setLongField(term80042, term80042.getClass(), "dateTime", 5966731553888818893L);
        setField(term80040, term80040.getClass(), "user", term80042);
        setIntField(term80040, term80040.getClass(), "courseId", 928651112);
        setBooleanField(term80040, term80040.getClass(), "isLastClear", true);
        setIntField(term80040, term80040.getClass(), "totalRestlife", -970446181);
        setIntField(term80040, term80040.getClass(), "totalAchievement", 484689354);
        setIntField(term80040, term80040.getClass(), "totalDeluxscore", 1836490268);
        setIntField(term80040, term80040.getClass(), "playCount", 388735696);
        setField(term80040, term80040.getClass(), "clearDate", "FfynoMXicS");
        setField(term80040, term80040.getClass(), "lastPlayDate", "mbofhtwtHb");
        setIntField(term80040, term80040.getClass(), "bestAchievement", 105946838);
        setField(term80040, term80040.getClass(), "bestAchievementDate", "goCKhChLTQ");
        setIntField(term80040, term80040.getClass(), "bestDeluxscore", -2076570725);
        setField(term80040, term80040.getClass(), "bestDeluxscoreDate", "VkjCLLOwvZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestDeluxscoreDate", argTypes, term80040, args);
    }

};


