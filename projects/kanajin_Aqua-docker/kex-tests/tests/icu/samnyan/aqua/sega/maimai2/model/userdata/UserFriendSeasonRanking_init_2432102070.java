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

public class UserFriendSeasonRanking_init_2432102070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14634;

    public UserFriendSeasonRanking_init_2432102070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14638 = new Long(7009926388951271268L);
        Integer term14701 = new Integer(-75206835);
        Integer term14703 = new Integer(-1618206977);
        Integer term14705 = new Integer(-1747406163);
        ArrayList term14699 = new ArrayList();
        ((ArrayList) term14699).add(term14701);
        ((ArrayList) term14699).add(term14703);
        ((ArrayList) term14699).add(term14705);
        Integer term14711 = new Integer(388157121);
        Integer term14713 = new Integer(1684998508);
        Integer term14715 = new Integer(-1476644457);
        Integer term14717 = new Integer(1270666529);
        ArrayList term14709 = new ArrayList();
        ((ArrayList) term14709).add(term14711);
        ((ArrayList) term14709).add(term14713);
        ((ArrayList) term14709).add(term14715);
        ((ArrayList) term14709).add(term14717);
        term14634 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term14636 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14667 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14634, term14634.getClass(), "id", 8847748922379375307L);
        setLongField(term14636, term14636.getClass(), "id", 1350676497718116574L);
        setField(term14636, term14636.getClass(), "extId", term14638);
        setField(term14636, term14636.getClass(), "luid", "mfHtgSbdjD");
        setIntField(term14653, term14653.getClass(), "year", 2024);
        setShortField(term14653, term14653.getClass(), "month", (short) 5);
        setShortField(term14653, term14653.getClass(), "day", (short) 6);
        setField(term14652, term14652.getClass(), "date", term14653);
        setByteField(term14657, term14657.getClass(), "hour", (byte) 20);
        setByteField(term14657, term14657.getClass(), "minute", (byte) 14);
        setByteField(term14657, term14657.getClass(), "second", (byte) 27);
        setIntField(term14657, term14657.getClass(), "nano", 900636101);
        setField(term14652, term14652.getClass(), "time", term14657);
        setField(term14636, term14636.getClass(), "registerTime", term14652);
        setIntField(term14663, term14663.getClass(), "year", 2021);
        setShortField(term14663, term14663.getClass(), "month", (short) 4);
        setShortField(term14663, term14663.getClass(), "day", (short) 17);
        setField(term14662, term14662.getClass(), "date", term14663);
        setByteField(term14667, term14667.getClass(), "hour", (byte) 4);
        setByteField(term14667, term14667.getClass(), "minute", (byte) 11);
        setByteField(term14667, term14667.getClass(), "second", (byte) 16);
        setIntField(term14667, term14667.getClass(), "nano", 509895858);
        setField(term14662, term14662.getClass(), "time", term14667);
        setField(term14636, term14636.getClass(), "accessTime", term14662);
        setField(term14634, term14634.getClass(), "card", term14636);
        setField(term14634, term14634.getClass(), "userName", "cmuaUiHMVL");
        setIntField(term14634, term14634.getClass(), "isNetMember", 148394188);
        setIntField(term14634, term14634.getClass(), "iconId", 504525721);
        setIntField(term14634, term14634.getClass(), "plateId", 1835568392);
        setIntField(term14634, term14634.getClass(), "titleId", 457470807);
        setIntField(term14634, term14634.getClass(), "partnerId", -994742871);
        setIntField(term14634, term14634.getClass(), "frameId", -222412326);
        setIntField(term14634, term14634.getClass(), "selectMapId", -299497261);
        setIntField(term14634, term14634.getClass(), "totalAwake", -23054366);
        setIntField(term14634, term14634.getClass(), "gradeRating", 153009426);
        setIntField(term14634, term14634.getClass(), "musicRating", 185751892);
        setIntField(term14634, term14634.getClass(), "playerRating", 1068256001);
        setIntField(term14634, term14634.getClass(), "highestRating", 1139078354);
        setIntField(term14634, term14634.getClass(), "gradeRank", -691164974);
        setIntField(term14634, term14634.getClass(), "classRank", -761675396);
        setIntField(term14634, term14634.getClass(), "courseRank", -1954860951);
        setField(term14634, term14634.getClass(), "charaSlot", term14699);
        setField(term14634, term14634.getClass(), "charaLockSlot", term14709);
        setLongField(term14634, term14634.getClass(), "contentBit", -4477377284889705897L);
        setIntField(term14634, term14634.getClass(), "playCount", -2078879114);
        setField(term14634, term14634.getClass(), "eventWatchedDate", "xjoSGPWUgu");
        setField(term14634, term14634.getClass(), "lastGameId", "uzmqjnOUXu");
        setField(term14634, term14634.getClass(), "lastRomVersion", "xeyjTOCOJb");
        setField(term14634, term14634.getClass(), "lastDataVersion", "DGRqjjdhzy");
        setField(term14634, term14634.getClass(), "lastLoginDate", "lQFkjJUPAR");
        setField(term14634, term14634.getClass(), "lastPlayDate", "BsuVlGUUjV");
        setIntField(term14634, term14634.getClass(), "lastPlayCredit", -1186882318);
        setIntField(term14634, term14634.getClass(), "lastPlayMode", 1077647088);
        setIntField(term14634, term14634.getClass(), "lastPlaceId", -705176810);
        setField(term14634, term14634.getClass(), "lastPlaceName", "bHHjfDCntT");
        setIntField(term14634, term14634.getClass(), "lastAllNetId", -1584779593);
        setIntField(term14634, term14634.getClass(), "lastRegionId", 303007547);
        setField(term14634, term14634.getClass(), "lastRegionName", "sEphiduvkv");
        setField(term14634, term14634.getClass(), "lastClientId", "PbLgCSAHce");
        setField(term14634, term14634.getClass(), "lastCountryCode", "NWldOLAbqk");
        setIntField(term14634, term14634.getClass(), "lastSelectEMoney", 1498738343);
        setIntField(term14634, term14634.getClass(), "lastSelectTicket", -1635571857);
        setIntField(term14634, term14634.getClass(), "lastSelectCourse", 1407309162);
        setIntField(term14634, term14634.getClass(), "lastCountCourse", -534033672);
        setField(term14634, term14634.getClass(), "firstGameId", "qnYaYSpDwO");
        setField(term14634, term14634.getClass(), "firstRomVersion", "dgbFDCdHtj");
        setField(term14634, term14634.getClass(), "firstDataVersion", "EKpdCBubDE");
        setField(term14634, term14634.getClass(), "firstPlayDate", "zMsSLTfGhl");
        setField(term14634, term14634.getClass(), "compatibleCmVersion", "bEmHScVZaQ");
        setField(term14634, term14634.getClass(), "dailyBonusDate", "TcuXODkzBV");
        setField(term14634, term14634.getClass(), "dailyCourseBonusDate", "coJPjrBZNe");
        setField(term14634, term14634.getClass(), "lastPairLoginDate", "vMsWjuPTnO");
        setField(term14634, term14634.getClass(), "lastTrialPlayDate", "zHvfKaOstO");
        setIntField(term14634, term14634.getClass(), "playVsCount", -1162790806);
        setIntField(term14634, term14634.getClass(), "playSyncCount", -1264595049);
        setIntField(term14634, term14634.getClass(), "winCount", -2058884635);
        setIntField(term14634, term14634.getClass(), "helpCount", 1064185088);
        setIntField(term14634, term14634.getClass(), "comboCount", -1249782654);
        setLongField(term14634, term14634.getClass(), "totalDeluxscore", 6323132402520425961L);
        setLongField(term14634, term14634.getClass(), "totalBasicDeluxscore", -354905832180781372L);
        setLongField(term14634, term14634.getClass(), "totalAdvancedDeluxscore", -5967061076297699457L);
        setLongField(term14634, term14634.getClass(), "totalExpertDeluxscore", 1550364590565203407L);
        setLongField(term14634, term14634.getClass(), "totalMasterDeluxscore", 4530705892517898929L);
        setLongField(term14634, term14634.getClass(), "totalReMasterDeluxscore", 7450734758126089960L);
        setIntField(term14634, term14634.getClass(), "totalSync", 399302934);
        setIntField(term14634, term14634.getClass(), "totalBasicSync", -1823255084);
        setIntField(term14634, term14634.getClass(), "totalAdvancedSync", 793345010);
        setIntField(term14634, term14634.getClass(), "totalExpertSync", -2092117838);
        setIntField(term14634, term14634.getClass(), "totalMasterSync", 1524590776);
        setIntField(term14634, term14634.getClass(), "totalReMasterSync", 1523896653);
        setLongField(term14634, term14634.getClass(), "totalAchievement", 1377567570761089535L);
        setLongField(term14634, term14634.getClass(), "totalBasicAchievement", -8531377551015443915L);
        setLongField(term14634, term14634.getClass(), "totalAdvancedAchievement", -3048863932438585863L);
        setLongField(term14634, term14634.getClass(), "totalExpertAchievement", -7155106718297861156L);
        setLongField(term14634, term14634.getClass(), "totalMasterAchievement", -4191270658895729623L);
        setLongField(term14634, term14634.getClass(), "totalReMasterAchievement", 349726685019432833L);
        setLongField(term14634, term14634.getClass(), "playerOldRating", 5047215164896153648L);
        setLongField(term14634, term14634.getClass(), "playerNewRating", 6695041041196724237L);
        setIntField(term14634, term14634.getClass(), "banState", -1731921726);
        setLongField(term14634, term14634.getClass(), "dateTime", -9133417318192430290L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term14634;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


