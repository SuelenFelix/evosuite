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

public class UserFavorite_setItemKind_17480412209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569096;
     Object term569457;

    public UserFavorite_setItemKind_17480412209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term569102 = new Long(8242382965219431687L);
        Integer term569165 = new Integer(542088374);
        Integer term569167 = new Integer(-950297218);
        Integer term569169 = new Integer(1244123877);
        Integer term569171 = new Integer(-1662703727);
        ArrayList term569163 = new ArrayList();
        ((ArrayList) term569163).add(term569165);
        ((ArrayList) term569163).add(term569167);
        ((ArrayList) term569163).add(term569169);
        ((ArrayList) term569163).add(term569171);
        ArrayList term569175 = new ArrayList();
        Integer term569449 = new Integer(1279906508);
        Integer term569451 = new Integer(-238375706);
        Integer term569453 = new Integer(1556952863);
        ArrayList term569447 = new ArrayList();
        ((ArrayList) term569447).add(term569449);
        ((ArrayList) term569447).add(term569451);
        ((ArrayList) term569447).add(term569453);
        term569096 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term569098 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term569100 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term569116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term569117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term569121 = newInstance(Class.forName("java.time.LocalTime"));
        Object term569126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term569127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term569131 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term569096, term569096.getClass(), "id", 8862357810009606294L);
        setLongField(term569098, term569098.getClass(), "id", -6221164359282944241L);
        setLongField(term569100, term569100.getClass(), "id", 6404693456924679211L);
        setField(term569100, term569100.getClass(), "extId", term569102);
        setField(term569100, term569100.getClass(), "luid", "AIKbJRhdhF");
        setIntField(term569117, term569117.getClass(), "year", 2018);
        setShortField(term569117, term569117.getClass(), "month", (short) 11);
        setShortField(term569117, term569117.getClass(), "day", (short) 27);
        setField(term569116, term569116.getClass(), "date", term569117);
        setByteField(term569121, term569121.getClass(), "hour", (byte) 4);
        setByteField(term569121, term569121.getClass(), "minute", (byte) 0);
        setByteField(term569121, term569121.getClass(), "second", (byte) 11);
        setIntField(term569121, term569121.getClass(), "nano", 685942391);
        setField(term569116, term569116.getClass(), "time", term569121);
        setField(term569100, term569100.getClass(), "registerTime", term569116);
        setIntField(term569127, term569127.getClass(), "year", 2022);
        setShortField(term569127, term569127.getClass(), "month", (short) 6);
        setShortField(term569127, term569127.getClass(), "day", (short) 11);
        setField(term569126, term569126.getClass(), "date", term569127);
        setByteField(term569131, term569131.getClass(), "hour", (byte) 17);
        setByteField(term569131, term569131.getClass(), "minute", (byte) 9);
        setByteField(term569131, term569131.getClass(), "second", (byte) 40);
        setIntField(term569131, term569131.getClass(), "nano", 253206883);
        setField(term569126, term569126.getClass(), "time", term569131);
        setField(term569100, term569100.getClass(), "accessTime", term569126);
        setField(term569098, term569098.getClass(), "card", term569100);
        setField(term569098, term569098.getClass(), "userName", "VNDqGKHLng");
        setIntField(term569098, term569098.getClass(), "isNetMember", 1140424787);
        setIntField(term569098, term569098.getClass(), "iconId", 1340620890);
        setIntField(term569098, term569098.getClass(), "plateId", -1451372602);
        setIntField(term569098, term569098.getClass(), "titleId", -782989904);
        setIntField(term569098, term569098.getClass(), "partnerId", 415448953);
        setIntField(term569098, term569098.getClass(), "frameId", -1039173965);
        setIntField(term569098, term569098.getClass(), "selectMapId", 2023867605);
        setIntField(term569098, term569098.getClass(), "totalAwake", 939497254);
        setIntField(term569098, term569098.getClass(), "gradeRating", -2146085750);
        setIntField(term569098, term569098.getClass(), "musicRating", 1484063958);
        setIntField(term569098, term569098.getClass(), "playerRating", -132522107);
        setIntField(term569098, term569098.getClass(), "highestRating", 1808918199);
        setIntField(term569098, term569098.getClass(), "gradeRank", -1925994822);
        setIntField(term569098, term569098.getClass(), "classRank", -1242352971);
        setIntField(term569098, term569098.getClass(), "courseRank", -1645511094);
        setField(term569098, term569098.getClass(), "charaSlot", term569163);
        setField(term569098, term569098.getClass(), "charaLockSlot", term569175);
        setLongField(term569098, term569098.getClass(), "contentBit", 2622189793784972406L);
        setIntField(term569098, term569098.getClass(), "playCount", 2067786780);
        setField(term569098, term569098.getClass(), "eventWatchedDate", "vGHDvTozyw");
        setField(term569098, term569098.getClass(), "lastGameId", "otsBFPSzMN");
        setField(term569098, term569098.getClass(), "lastRomVersion", "mBjgkCslYS");
        setField(term569098, term569098.getClass(), "lastDataVersion", "zDtdcfnWMd");
        setField(term569098, term569098.getClass(), "lastLoginDate", "rtLjULSuGQ");
        setField(term569098, term569098.getClass(), "lastPlayDate", "sZjvHCBatw");
        setIntField(term569098, term569098.getClass(), "lastPlayCredit", 2006048718);
        setIntField(term569098, term569098.getClass(), "lastPlayMode", -1542073663);
        setIntField(term569098, term569098.getClass(), "lastPlaceId", 1141138644);
        setField(term569098, term569098.getClass(), "lastPlaceName", "gEibIwXUqx");
        setIntField(term569098, term569098.getClass(), "lastAllNetId", -145695915);
        setIntField(term569098, term569098.getClass(), "lastRegionId", 1583463883);
        setField(term569098, term569098.getClass(), "lastRegionName", "GkgIFVgDRs");
        setField(term569098, term569098.getClass(), "lastClientId", "ljpkdQHQFN");
        setField(term569098, term569098.getClass(), "lastCountryCode", "ngtvqkTwyf");
        setIntField(term569098, term569098.getClass(), "lastSelectEMoney", -1643461749);
        setIntField(term569098, term569098.getClass(), "lastSelectTicket", 541804268);
        setIntField(term569098, term569098.getClass(), "lastSelectCourse", 1121204465);
        setIntField(term569098, term569098.getClass(), "lastCountCourse", -867677201);
        setField(term569098, term569098.getClass(), "firstGameId", "xlxGsBXIAE");
        setField(term569098, term569098.getClass(), "firstRomVersion", "LVFAuPUXWH");
        setField(term569098, term569098.getClass(), "firstDataVersion", "krqpkZCmGH");
        setField(term569098, term569098.getClass(), "firstPlayDate", "XDJVpWUWRW");
        setField(term569098, term569098.getClass(), "compatibleCmVersion", "gMudxbEicy");
        setField(term569098, term569098.getClass(), "dailyBonusDate", "pZLpzWSjCF");
        setField(term569098, term569098.getClass(), "dailyCourseBonusDate", "WkjQpbfMLh");
        setField(term569098, term569098.getClass(), "lastPairLoginDate", "HjgRscyZOo");
        setField(term569098, term569098.getClass(), "lastTrialPlayDate", "tnevRuGrRA");
        setIntField(term569098, term569098.getClass(), "playVsCount", -823760978);
        setIntField(term569098, term569098.getClass(), "playSyncCount", -911364988);
        setIntField(term569098, term569098.getClass(), "winCount", -827986292);
        setIntField(term569098, term569098.getClass(), "helpCount", -327600411);
        setIntField(term569098, term569098.getClass(), "comboCount", -203606035);
        setLongField(term569098, term569098.getClass(), "totalDeluxscore", -7732041643666034407L);
        setLongField(term569098, term569098.getClass(), "totalBasicDeluxscore", -2183771739748005527L);
        setLongField(term569098, term569098.getClass(), "totalAdvancedDeluxscore", -1668694242414840258L);
        setLongField(term569098, term569098.getClass(), "totalExpertDeluxscore", -2442477029455324485L);
        setLongField(term569098, term569098.getClass(), "totalMasterDeluxscore", 1919724072885987951L);
        setLongField(term569098, term569098.getClass(), "totalReMasterDeluxscore", -4448003139148299534L);
        setIntField(term569098, term569098.getClass(), "totalSync", 891257608);
        setIntField(term569098, term569098.getClass(), "totalBasicSync", 1082172313);
        setIntField(term569098, term569098.getClass(), "totalAdvancedSync", -625561549);
        setIntField(term569098, term569098.getClass(), "totalExpertSync", -1719544937);
        setIntField(term569098, term569098.getClass(), "totalMasterSync", 1609691130);
        setIntField(term569098, term569098.getClass(), "totalReMasterSync", 1939234401);
        setLongField(term569098, term569098.getClass(), "totalAchievement", -1259995005111779465L);
        setLongField(term569098, term569098.getClass(), "totalBasicAchievement", -5150094293636684062L);
        setLongField(term569098, term569098.getClass(), "totalAdvancedAchievement", 2215708091806001503L);
        setLongField(term569098, term569098.getClass(), "totalExpertAchievement", 1766216042638061719L);
        setLongField(term569098, term569098.getClass(), "totalMasterAchievement", -7752514179983532561L);
        setLongField(term569098, term569098.getClass(), "totalReMasterAchievement", 498848982248916088L);
        setLongField(term569098, term569098.getClass(), "playerOldRating", 4917531709642066037L);
        setLongField(term569098, term569098.getClass(), "playerNewRating", 4442802596467025064L);
        setIntField(term569098, term569098.getClass(), "banState", -324561674);
        setLongField(term569098, term569098.getClass(), "dateTime", 237130489438746052L);
        setField(term569096, term569096.getClass(), "user", term569098);
        setLongField(term569096, term569096.getClass(), "favUserId", 3633027401753765551L);
        setIntField(term569096, term569096.getClass(), "itemKind", -2111229134);
        setField(term569096, term569096.getClass(), "itemIdList", term569447);
        term569457 = new Integer(-718522179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term569457;
        callMethod(klass, "setItemKind", argTypes, term569096, args);
    }

};


