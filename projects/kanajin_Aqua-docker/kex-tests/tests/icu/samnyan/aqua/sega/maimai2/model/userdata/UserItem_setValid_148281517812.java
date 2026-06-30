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
import java.lang.Boolean;

public class UserItem_setValid_148281517812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40366;
     Object term40717;

    public UserItem_setValid_148281517812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40372 = new Long(7994303628307559416L);
        Integer term40435 = new Integer(1136208236);
        ArrayList term40433 = new ArrayList();
        ((ArrayList) term40433).add(term40435);
        Integer term40441 = new Integer(-1220630391);
        Integer term40443 = new Integer(-995822131);
        ArrayList term40439 = new ArrayList();
        ((ArrayList) term40439).add(term40441);
        ((ArrayList) term40439).add(term40443);
        term40366 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term40368 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term40370 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40401 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40366, term40366.getClass(), "id", 8580739755779561159L);
        setLongField(term40368, term40368.getClass(), "id", -4916056690424367636L);
        setLongField(term40370, term40370.getClass(), "id", -971944383326299487L);
        setField(term40370, term40370.getClass(), "extId", term40372);
        setField(term40370, term40370.getClass(), "luid", "IoefPqGtaj");
        setIntField(term40387, term40387.getClass(), "year", 2014);
        setShortField(term40387, term40387.getClass(), "month", (short) 1);
        setShortField(term40387, term40387.getClass(), "day", (short) 26);
        setField(term40386, term40386.getClass(), "date", term40387);
        setByteField(term40391, term40391.getClass(), "hour", (byte) 3);
        setByteField(term40391, term40391.getClass(), "minute", (byte) 31);
        setByteField(term40391, term40391.getClass(), "second", (byte) 56);
        setIntField(term40391, term40391.getClass(), "nano", 100873602);
        setField(term40386, term40386.getClass(), "time", term40391);
        setField(term40370, term40370.getClass(), "registerTime", term40386);
        setIntField(term40397, term40397.getClass(), "year", 2021);
        setShortField(term40397, term40397.getClass(), "month", (short) 12);
        setShortField(term40397, term40397.getClass(), "day", (short) 1);
        setField(term40396, term40396.getClass(), "date", term40397);
        setByteField(term40401, term40401.getClass(), "hour", (byte) 15);
        setByteField(term40401, term40401.getClass(), "minute", (byte) 30);
        setByteField(term40401, term40401.getClass(), "second", (byte) 5);
        setIntField(term40401, term40401.getClass(), "nano", 996341606);
        setField(term40396, term40396.getClass(), "time", term40401);
        setField(term40370, term40370.getClass(), "accessTime", term40396);
        setField(term40368, term40368.getClass(), "card", term40370);
        setField(term40368, term40368.getClass(), "userName", "YMmtjELJuB");
        setIntField(term40368, term40368.getClass(), "isNetMember", 1130655068);
        setIntField(term40368, term40368.getClass(), "iconId", 1747437566);
        setIntField(term40368, term40368.getClass(), "plateId", -1175737970);
        setIntField(term40368, term40368.getClass(), "titleId", 891165187);
        setIntField(term40368, term40368.getClass(), "partnerId", 1608737678);
        setIntField(term40368, term40368.getClass(), "frameId", -1605443550);
        setIntField(term40368, term40368.getClass(), "selectMapId", -735690372);
        setIntField(term40368, term40368.getClass(), "totalAwake", 110644904);
        setIntField(term40368, term40368.getClass(), "gradeRating", -1457905205);
        setIntField(term40368, term40368.getClass(), "musicRating", 1722454323);
        setIntField(term40368, term40368.getClass(), "playerRating", 630174216);
        setIntField(term40368, term40368.getClass(), "highestRating", -1081282297);
        setIntField(term40368, term40368.getClass(), "gradeRank", 1331103887);
        setIntField(term40368, term40368.getClass(), "classRank", 637911543);
        setIntField(term40368, term40368.getClass(), "courseRank", -779100899);
        setField(term40368, term40368.getClass(), "charaSlot", term40433);
        setField(term40368, term40368.getClass(), "charaLockSlot", term40439);
        setLongField(term40368, term40368.getClass(), "contentBit", -5921915827741960720L);
        setIntField(term40368, term40368.getClass(), "playCount", -1750603840);
        setField(term40368, term40368.getClass(), "eventWatchedDate", "FzyIShiOmb");
        setField(term40368, term40368.getClass(), "lastGameId", "PEUfeJaZTk");
        setField(term40368, term40368.getClass(), "lastRomVersion", "AIvyeIdskz");
        setField(term40368, term40368.getClass(), "lastDataVersion", "iSQqMWMRlU");
        setField(term40368, term40368.getClass(), "lastLoginDate", "djWEnlbOXu");
        setField(term40368, term40368.getClass(), "lastPlayDate", "MvDMzQBWME");
        setIntField(term40368, term40368.getClass(), "lastPlayCredit", 2088919651);
        setIntField(term40368, term40368.getClass(), "lastPlayMode", 949997254);
        setIntField(term40368, term40368.getClass(), "lastPlaceId", 690762493);
        setField(term40368, term40368.getClass(), "lastPlaceName", "sZyAwmdGVS");
        setIntField(term40368, term40368.getClass(), "lastAllNetId", -1050083704);
        setIntField(term40368, term40368.getClass(), "lastRegionId", -1513402749);
        setField(term40368, term40368.getClass(), "lastRegionName", "VoKhXiLAaW");
        setField(term40368, term40368.getClass(), "lastClientId", "CaalXzRXQI");
        setField(term40368, term40368.getClass(), "lastCountryCode", "eRBnKPjyVg");
        setIntField(term40368, term40368.getClass(), "lastSelectEMoney", -1865692837);
        setIntField(term40368, term40368.getClass(), "lastSelectTicket", 966678407);
        setIntField(term40368, term40368.getClass(), "lastSelectCourse", -881632231);
        setIntField(term40368, term40368.getClass(), "lastCountCourse", -1285148224);
        setField(term40368, term40368.getClass(), "firstGameId", "svPqsHBvrm");
        setField(term40368, term40368.getClass(), "firstRomVersion", "sRzUJLYMmB");
        setField(term40368, term40368.getClass(), "firstDataVersion", "XxILklSDwz");
        setField(term40368, term40368.getClass(), "firstPlayDate", "TLjhFZbwKO");
        setField(term40368, term40368.getClass(), "compatibleCmVersion", "nxEbLIApFc");
        setField(term40368, term40368.getClass(), "dailyBonusDate", "zzsdNZhejE");
        setField(term40368, term40368.getClass(), "dailyCourseBonusDate", "ILoodMZrgR");
        setField(term40368, term40368.getClass(), "lastPairLoginDate", "XQiKmsCacK");
        setField(term40368, term40368.getClass(), "lastTrialPlayDate", "cTCixEbHYT");
        setIntField(term40368, term40368.getClass(), "playVsCount", -2002558482);
        setIntField(term40368, term40368.getClass(), "playSyncCount", 794384312);
        setIntField(term40368, term40368.getClass(), "winCount", 1166664554);
        setIntField(term40368, term40368.getClass(), "helpCount", -1287204441);
        setIntField(term40368, term40368.getClass(), "comboCount", 1826016641);
        setLongField(term40368, term40368.getClass(), "totalDeluxscore", -2480054455719869328L);
        setLongField(term40368, term40368.getClass(), "totalBasicDeluxscore", 8637380632328451251L);
        setLongField(term40368, term40368.getClass(), "totalAdvancedDeluxscore", -9204025169674713263L);
        setLongField(term40368, term40368.getClass(), "totalExpertDeluxscore", 8289082707825797292L);
        setLongField(term40368, term40368.getClass(), "totalMasterDeluxscore", -5515080039914707735L);
        setLongField(term40368, term40368.getClass(), "totalReMasterDeluxscore", -6249289368466698064L);
        setIntField(term40368, term40368.getClass(), "totalSync", 1726886771);
        setIntField(term40368, term40368.getClass(), "totalBasicSync", 1045689376);
        setIntField(term40368, term40368.getClass(), "totalAdvancedSync", 767458787);
        setIntField(term40368, term40368.getClass(), "totalExpertSync", 2103721338);
        setIntField(term40368, term40368.getClass(), "totalMasterSync", 621330308);
        setIntField(term40368, term40368.getClass(), "totalReMasterSync", -1597424060);
        setLongField(term40368, term40368.getClass(), "totalAchievement", 4087729695916598698L);
        setLongField(term40368, term40368.getClass(), "totalBasicAchievement", -590628922285125667L);
        setLongField(term40368, term40368.getClass(), "totalAdvancedAchievement", 6167026289140715860L);
        setLongField(term40368, term40368.getClass(), "totalExpertAchievement", -5583016716246948935L);
        setLongField(term40368, term40368.getClass(), "totalMasterAchievement", -5567719604161729601L);
        setLongField(term40368, term40368.getClass(), "totalReMasterAchievement", -8754542710304507750L);
        setLongField(term40368, term40368.getClass(), "playerOldRating", -5957491491329394218L);
        setLongField(term40368, term40368.getClass(), "playerNewRating", 280552269591781447L);
        setIntField(term40368, term40368.getClass(), "banState", 243854303);
        setLongField(term40368, term40368.getClass(), "dateTime", 1721306000453653222L);
        setField(term40366, term40366.getClass(), "user", term40368);
        setIntField(term40366, term40366.getClass(), "itemKind", 1754709105);
        setIntField(term40366, term40366.getClass(), "itemId", 1523196898);
        setIntField(term40366, term40366.getClass(), "stock", 2061147445);
        setBooleanField(term40366, term40366.getClass(), "isValid", true);
        term40717 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term40717;
        callMethod(klass, "setValid", argTypes, term40366, args);
    }

};


