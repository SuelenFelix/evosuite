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

public class UserDetail_setFirstPlayDate_1897390295122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264466;

    public UserDetail_setFirstPlayDate_1897390295122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term264470 = new Long(370847120687610747L);
        Integer term264533 = new Integer(1811211444);
        Integer term264535 = new Integer(-1188357817);
        Integer term264537 = new Integer(800428961);
        ArrayList term264531 = new ArrayList();
        ((ArrayList) term264531).add(term264533);
        ((ArrayList) term264531).add(term264535);
        ((ArrayList) term264531).add(term264537);
        Integer term264543 = new Integer(1035639807);
        Integer term264545 = new Integer(1255067608);
        ArrayList term264541 = new ArrayList();
        ((ArrayList) term264541).add(term264543);
        ((ArrayList) term264541).add(term264545);
        term264466 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term264468 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term264484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term264494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term264499 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term264466, term264466.getClass(), "id", -8367254254980333219L);
        setLongField(term264468, term264468.getClass(), "id", 1195778205327749725L);
        setField(term264468, term264468.getClass(), "extId", term264470);
        setField(term264468, term264468.getClass(), "luid", "zARCfPQBXQ");
        setIntField(term264485, term264485.getClass(), "year", 2015);
        setShortField(term264485, term264485.getClass(), "month", (short) 4);
        setShortField(term264485, term264485.getClass(), "day", (short) 27);
        setField(term264484, term264484.getClass(), "date", term264485);
        setByteField(term264489, term264489.getClass(), "hour", (byte) 14);
        setByteField(term264489, term264489.getClass(), "minute", (byte) 33);
        setByteField(term264489, term264489.getClass(), "second", (byte) 56);
        setIntField(term264489, term264489.getClass(), "nano", 249469563);
        setField(term264484, term264484.getClass(), "time", term264489);
        setField(term264468, term264468.getClass(), "registerTime", term264484);
        setIntField(term264495, term264495.getClass(), "year", 2014);
        setShortField(term264495, term264495.getClass(), "month", (short) 2);
        setShortField(term264495, term264495.getClass(), "day", (short) 18);
        setField(term264494, term264494.getClass(), "date", term264495);
        setByteField(term264499, term264499.getClass(), "hour", (byte) 10);
        setByteField(term264499, term264499.getClass(), "minute", (byte) 32);
        setByteField(term264499, term264499.getClass(), "second", (byte) 37);
        setIntField(term264499, term264499.getClass(), "nano", 707409108);
        setField(term264494, term264494.getClass(), "time", term264499);
        setField(term264468, term264468.getClass(), "accessTime", term264494);
        setField(term264466, term264466.getClass(), "card", term264468);
        setField(term264466, term264466.getClass(), "userName", "jCvumyMZwu");
        setIntField(term264466, term264466.getClass(), "isNetMember", 1732277430);
        setIntField(term264466, term264466.getClass(), "iconId", -992269487);
        setIntField(term264466, term264466.getClass(), "plateId", 182251243);
        setIntField(term264466, term264466.getClass(), "titleId", 164845144);
        setIntField(term264466, term264466.getClass(), "partnerId", -852907978);
        setIntField(term264466, term264466.getClass(), "frameId", -1262475668);
        setIntField(term264466, term264466.getClass(), "selectMapId", -1725400520);
        setIntField(term264466, term264466.getClass(), "totalAwake", 1608751044);
        setIntField(term264466, term264466.getClass(), "gradeRating", 1965647979);
        setIntField(term264466, term264466.getClass(), "musicRating", -1937704960);
        setIntField(term264466, term264466.getClass(), "playerRating", -1274831267);
        setIntField(term264466, term264466.getClass(), "highestRating", 1669039106);
        setIntField(term264466, term264466.getClass(), "gradeRank", -2061505753);
        setIntField(term264466, term264466.getClass(), "classRank", -509886343);
        setIntField(term264466, term264466.getClass(), "courseRank", 1135879823);
        setField(term264466, term264466.getClass(), "charaSlot", term264531);
        setField(term264466, term264466.getClass(), "charaLockSlot", term264541);
        setLongField(term264466, term264466.getClass(), "contentBit", 3949078485936403580L);
        setIntField(term264466, term264466.getClass(), "playCount", 1398941025);
        setField(term264466, term264466.getClass(), "eventWatchedDate", "pUOexalUMM");
        setField(term264466, term264466.getClass(), "lastGameId", "IKkHVBybPv");
        setField(term264466, term264466.getClass(), "lastRomVersion", "uDfBwiLidX");
        setField(term264466, term264466.getClass(), "lastDataVersion", "LkaxztUhKP");
        setField(term264466, term264466.getClass(), "lastLoginDate", "JAiMiiwIyd");
        setField(term264466, term264466.getClass(), "lastPlayDate", "HZEoZFSfys");
        setIntField(term264466, term264466.getClass(), "lastPlayCredit", -1920006530);
        setIntField(term264466, term264466.getClass(), "lastPlayMode", 1458463226);
        setIntField(term264466, term264466.getClass(), "lastPlaceId", -354078805);
        setField(term264466, term264466.getClass(), "lastPlaceName", "usGpZUqeig");
        setIntField(term264466, term264466.getClass(), "lastAllNetId", -1121055221);
        setIntField(term264466, term264466.getClass(), "lastRegionId", 1162857131);
        setField(term264466, term264466.getClass(), "lastRegionName", "zshYTmGpAb");
        setField(term264466, term264466.getClass(), "lastClientId", "OLrThOaeRP");
        setField(term264466, term264466.getClass(), "lastCountryCode", "PXaTZfbXEG");
        setIntField(term264466, term264466.getClass(), "lastSelectEMoney", 1199300206);
        setIntField(term264466, term264466.getClass(), "lastSelectTicket", 564539074);
        setIntField(term264466, term264466.getClass(), "lastSelectCourse", -1788496333);
        setIntField(term264466, term264466.getClass(), "lastCountCourse", -739420621);
        setField(term264466, term264466.getClass(), "firstGameId", "euhRkgIHwR");
        setField(term264466, term264466.getClass(), "firstRomVersion", "fGCjMhYeuP");
        setField(term264466, term264466.getClass(), "firstDataVersion", "tQRvyNwDqB");
        setField(term264466, term264466.getClass(), "firstPlayDate", "dIKNQsSoMj");
        setField(term264466, term264466.getClass(), "compatibleCmVersion", "HqjQGEpUiH");
        setField(term264466, term264466.getClass(), "dailyBonusDate", "BtiUMsmVbh");
        setField(term264466, term264466.getClass(), "dailyCourseBonusDate", "INHNqaImEM");
        setField(term264466, term264466.getClass(), "lastPairLoginDate", "vPIneuzFyr");
        setField(term264466, term264466.getClass(), "lastTrialPlayDate", "eGDUBxxnZQ");
        setIntField(term264466, term264466.getClass(), "playVsCount", -757005603);
        setIntField(term264466, term264466.getClass(), "playSyncCount", 511007704);
        setIntField(term264466, term264466.getClass(), "winCount", 831195530);
        setIntField(term264466, term264466.getClass(), "helpCount", -1466546102);
        setIntField(term264466, term264466.getClass(), "comboCount", 2065167360);
        setLongField(term264466, term264466.getClass(), "totalDeluxscore", 5769888992498667828L);
        setLongField(term264466, term264466.getClass(), "totalBasicDeluxscore", 8853760313760870341L);
        setLongField(term264466, term264466.getClass(), "totalAdvancedDeluxscore", -691752997101303485L);
        setLongField(term264466, term264466.getClass(), "totalExpertDeluxscore", 9204405381484893012L);
        setLongField(term264466, term264466.getClass(), "totalMasterDeluxscore", 5682932716649913572L);
        setLongField(term264466, term264466.getClass(), "totalReMasterDeluxscore", 345055035461307039L);
        setIntField(term264466, term264466.getClass(), "totalSync", -1556118295);
        setIntField(term264466, term264466.getClass(), "totalBasicSync", 1749932022);
        setIntField(term264466, term264466.getClass(), "totalAdvancedSync", 2127066486);
        setIntField(term264466, term264466.getClass(), "totalExpertSync", 621768726);
        setIntField(term264466, term264466.getClass(), "totalMasterSync", -1436840660);
        setIntField(term264466, term264466.getClass(), "totalReMasterSync", 2007506309);
        setLongField(term264466, term264466.getClass(), "totalAchievement", 6032613218593291507L);
        setLongField(term264466, term264466.getClass(), "totalBasicAchievement", 130183926330703836L);
        setLongField(term264466, term264466.getClass(), "totalAdvancedAchievement", -4997708985124567851L);
        setLongField(term264466, term264466.getClass(), "totalExpertAchievement", 4789113238025232800L);
        setLongField(term264466, term264466.getClass(), "totalMasterAchievement", 7225946296850444988L);
        setLongField(term264466, term264466.getClass(), "totalReMasterAchievement", -581995266696978744L);
        setLongField(term264466, term264466.getClass(), "playerOldRating", -8154488624127942616L);
        setLongField(term264466, term264466.getClass(), "playerNewRating", -7789852825630884708L);
        setIntField(term264466, term264466.getClass(), "banState", -1376730510);
        setLongField(term264466, term264466.getClass(), "dateTime", -5122963794181751120L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mFAJYTcPxb";
        callMethod(klass, "setFirstPlayDate", argTypes, term264466, args);
    }

};


