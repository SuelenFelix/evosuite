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

public class UserDetail_setFirstPlayDate_1897390295121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264411;

    public UserDetail_setFirstPlayDate_1897390295121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term264415 = new Long(370847120687610747L);
        Integer term264478 = new Integer(1811211444);
        Integer term264480 = new Integer(-1188357817);
        Integer term264482 = new Integer(800428961);
        ArrayList term264476 = new ArrayList();
        ((ArrayList) term264476).add(term264478);
        ((ArrayList) term264476).add(term264480);
        ((ArrayList) term264476).add(term264482);
        Integer term264488 = new Integer(1035639807);
        Integer term264490 = new Integer(1255067608);
        ArrayList term264486 = new ArrayList();
        ((ArrayList) term264486).add(term264488);
        ((ArrayList) term264486).add(term264490);
        term264411 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term264413 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term264429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264434 = newInstance(Class.forName("java.time.LocalTime"));
        Object term264439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264444 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term264411, term264411.getClass(), "id", -8367254254980333219L);
        setLongField(term264413, term264413.getClass(), "id", 1195778205327749725L);
        setField(term264413, term264413.getClass(), "extId", term264415);
        setField(term264413, term264413.getClass(), "luid", "zARCfPQBXQ");
        setIntField(term264430, term264430.getClass(), "year", 2015);
        setShortField(term264430, term264430.getClass(), "month", (short) 4);
        setShortField(term264430, term264430.getClass(), "day", (short) 27);
        setField(term264429, term264429.getClass(), "date", term264430);
        setByteField(term264434, term264434.getClass(), "hour", (byte) 14);
        setByteField(term264434, term264434.getClass(), "minute", (byte) 33);
        setByteField(term264434, term264434.getClass(), "second", (byte) 56);
        setIntField(term264434, term264434.getClass(), "nano", 249469563);
        setField(term264429, term264429.getClass(), "time", term264434);
        setField(term264413, term264413.getClass(), "registerTime", term264429);
        setIntField(term264440, term264440.getClass(), "year", 2014);
        setShortField(term264440, term264440.getClass(), "month", (short) 2);
        setShortField(term264440, term264440.getClass(), "day", (short) 18);
        setField(term264439, term264439.getClass(), "date", term264440);
        setByteField(term264444, term264444.getClass(), "hour", (byte) 10);
        setByteField(term264444, term264444.getClass(), "minute", (byte) 32);
        setByteField(term264444, term264444.getClass(), "second", (byte) 37);
        setIntField(term264444, term264444.getClass(), "nano", 707409108);
        setField(term264439, term264439.getClass(), "time", term264444);
        setField(term264413, term264413.getClass(), "accessTime", term264439);
        setField(term264411, term264411.getClass(), "card", term264413);
        setField(term264411, term264411.getClass(), "userName", "jCvumyMZwu");
        setIntField(term264411, term264411.getClass(), "isNetMember", 1732277430);
        setIntField(term264411, term264411.getClass(), "iconId", -992269487);
        setIntField(term264411, term264411.getClass(), "plateId", 182251243);
        setIntField(term264411, term264411.getClass(), "titleId", 164845144);
        setIntField(term264411, term264411.getClass(), "partnerId", -852907978);
        setIntField(term264411, term264411.getClass(), "frameId", -1262475668);
        setIntField(term264411, term264411.getClass(), "selectMapId", -1725400520);
        setIntField(term264411, term264411.getClass(), "totalAwake", 1608751044);
        setIntField(term264411, term264411.getClass(), "gradeRating", 1965647979);
        setIntField(term264411, term264411.getClass(), "musicRating", -1937704960);
        setIntField(term264411, term264411.getClass(), "playerRating", -1274831267);
        setIntField(term264411, term264411.getClass(), "highestRating", 1669039106);
        setIntField(term264411, term264411.getClass(), "gradeRank", -2061505753);
        setIntField(term264411, term264411.getClass(), "classRank", -509886343);
        setIntField(term264411, term264411.getClass(), "courseRank", 1135879823);
        setField(term264411, term264411.getClass(), "charaSlot", term264476);
        setField(term264411, term264411.getClass(), "charaLockSlot", term264486);
        setLongField(term264411, term264411.getClass(), "contentBit", 3949078485936403580L);
        setIntField(term264411, term264411.getClass(), "playCount", 1398941025);
        setField(term264411, term264411.getClass(), "eventWatchedDate", "pUOexalUMM");
        setField(term264411, term264411.getClass(), "lastGameId", "IKkHVBybPv");
        setField(term264411, term264411.getClass(), "lastRomVersion", "uDfBwiLidX");
        setField(term264411, term264411.getClass(), "lastDataVersion", "LkaxztUhKP");
        setField(term264411, term264411.getClass(), "lastLoginDate", "JAiMiiwIyd");
        setField(term264411, term264411.getClass(), "lastPlayDate", "HZEoZFSfys");
        setIntField(term264411, term264411.getClass(), "lastPlayCredit", -1920006530);
        setIntField(term264411, term264411.getClass(), "lastPlayMode", 1458463226);
        setIntField(term264411, term264411.getClass(), "lastPlaceId", -354078805);
        setField(term264411, term264411.getClass(), "lastPlaceName", "usGpZUqeig");
        setIntField(term264411, term264411.getClass(), "lastAllNetId", -1121055221);
        setIntField(term264411, term264411.getClass(), "lastRegionId", 1162857131);
        setField(term264411, term264411.getClass(), "lastRegionName", "zshYTmGpAb");
        setField(term264411, term264411.getClass(), "lastClientId", "OLrThOaeRP");
        setField(term264411, term264411.getClass(), "lastCountryCode", "PXaTZfbXEG");
        setIntField(term264411, term264411.getClass(), "lastSelectEMoney", 1199300206);
        setIntField(term264411, term264411.getClass(), "lastSelectTicket", 564539074);
        setIntField(term264411, term264411.getClass(), "lastSelectCourse", -1788496333);
        setIntField(term264411, term264411.getClass(), "lastCountCourse", -739420621);
        setField(term264411, term264411.getClass(), "firstGameId", "euhRkgIHwR");
        setField(term264411, term264411.getClass(), "firstRomVersion", "fGCjMhYeuP");
        setField(term264411, term264411.getClass(), "firstDataVersion", "tQRvyNwDqB");
        setField(term264411, term264411.getClass(), "firstPlayDate", "dIKNQsSoMj");
        setField(term264411, term264411.getClass(), "compatibleCmVersion", "HqjQGEpUiH");
        setField(term264411, term264411.getClass(), "dailyBonusDate", "BtiUMsmVbh");
        setField(term264411, term264411.getClass(), "dailyCourseBonusDate", "INHNqaImEM");
        setField(term264411, term264411.getClass(), "lastPairLoginDate", "vPIneuzFyr");
        setField(term264411, term264411.getClass(), "lastTrialPlayDate", "eGDUBxxnZQ");
        setIntField(term264411, term264411.getClass(), "playVsCount", -757005603);
        setIntField(term264411, term264411.getClass(), "playSyncCount", 511007704);
        setIntField(term264411, term264411.getClass(), "winCount", 831195530);
        setIntField(term264411, term264411.getClass(), "helpCount", -1466546102);
        setIntField(term264411, term264411.getClass(), "comboCount", 2065167360);
        setLongField(term264411, term264411.getClass(), "totalDeluxscore", 5769888992498667828L);
        setLongField(term264411, term264411.getClass(), "totalBasicDeluxscore", 8853760313760870341L);
        setLongField(term264411, term264411.getClass(), "totalAdvancedDeluxscore", -691752997101303485L);
        setLongField(term264411, term264411.getClass(), "totalExpertDeluxscore", 9204405381484893012L);
        setLongField(term264411, term264411.getClass(), "totalMasterDeluxscore", 5682932716649913572L);
        setLongField(term264411, term264411.getClass(), "totalReMasterDeluxscore", 345055035461307039L);
        setIntField(term264411, term264411.getClass(), "totalSync", -1556118295);
        setIntField(term264411, term264411.getClass(), "totalBasicSync", 1749932022);
        setIntField(term264411, term264411.getClass(), "totalAdvancedSync", 2127066486);
        setIntField(term264411, term264411.getClass(), "totalExpertSync", 621768726);
        setIntField(term264411, term264411.getClass(), "totalMasterSync", -1436840660);
        setIntField(term264411, term264411.getClass(), "totalReMasterSync", 2007506309);
        setLongField(term264411, term264411.getClass(), "totalAchievement", 6032613218593291507L);
        setLongField(term264411, term264411.getClass(), "totalBasicAchievement", 130183926330703836L);
        setLongField(term264411, term264411.getClass(), "totalAdvancedAchievement", -4997708985124567851L);
        setLongField(term264411, term264411.getClass(), "totalExpertAchievement", 4789113238025232800L);
        setLongField(term264411, term264411.getClass(), "totalMasterAchievement", 7225946296850444988L);
        setLongField(term264411, term264411.getClass(), "totalReMasterAchievement", -581995266696978744L);
        setLongField(term264411, term264411.getClass(), "playerOldRating", -8154488624127942616L);
        setLongField(term264411, term264411.getClass(), "playerNewRating", -7789852825630884708L);
        setIntField(term264411, term264411.getClass(), "banState", -1376730510);
        setLongField(term264411, term264411.getClass(), "dateTime", -5122963794181751120L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mFAJYTcPxb";
        callMethod(klass, "setFirstPlayDate", argTypes, term264411, args);
    }

};


