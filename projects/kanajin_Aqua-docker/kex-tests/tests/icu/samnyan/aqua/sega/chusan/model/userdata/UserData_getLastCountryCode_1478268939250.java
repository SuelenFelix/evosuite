package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getLastCountryCode_1478268939250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215348;

    public UserData_getLastCountryCode_1478268939250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215348 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4215348, term4215348.getClass(), "id", 0L);
        setField(term4215348, term4215348.getClass(), "card", null);
        setField(term4215348, term4215348.getClass(), "userName", null);
        setIntField(term4215348, term4215348.getClass(), "level", 0);
        setIntField(term4215348, term4215348.getClass(), "reincarnationNum", 0);
        setField(term4215348, term4215348.getClass(), "exp", null);
        setLongField(term4215348, term4215348.getClass(), "point", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalPoint", 0L);
        setIntField(term4215348, term4215348.getClass(), "playCount", 0);
        setIntField(term4215348, term4215348.getClass(), "multiPlayCount", 0);
        setIntField(term4215348, term4215348.getClass(), "playerRating", 0);
        setIntField(term4215348, term4215348.getClass(), "highestRating", 0);
        setIntField(term4215348, term4215348.getClass(), "nameplateId", 0);
        setIntField(term4215348, term4215348.getClass(), "frameId", 0);
        setIntField(term4215348, term4215348.getClass(), "characterId", 0);
        setIntField(term4215348, term4215348.getClass(), "trophyId", 0);
        setIntField(term4215348, term4215348.getClass(), "playedTutorialBit", 0);
        setIntField(term4215348, term4215348.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4215348, term4215348.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4215348, term4215348.getClass(), "totalMapNum", 0);
        setLongField(term4215348, term4215348.getClass(), "totalHiScore", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4215348, term4215348.getClass(), "totalUltimaHighScore", 0L);
        setField(term4215348, term4215348.getClass(), "eventWatchedDate", null);
        setIntField(term4215348, term4215348.getClass(), "friendCount", 0);
        setField(term4215348, term4215348.getClass(), "firstGameId", null);
        setField(term4215348, term4215348.getClass(), "firstRomVersion", null);
        setField(term4215348, term4215348.getClass(), "firstDataVersion", null);
        setField(term4215348, term4215348.getClass(), "firstPlayDate", null);
        setField(term4215348, term4215348.getClass(), "lastGameId", null);
        setField(term4215348, term4215348.getClass(), "lastRomVersion", null);
        setField(term4215348, term4215348.getClass(), "lastDataVersion", null);
        setField(term4215348, term4215348.getClass(), "lastLoginDate", null);
        setField(term4215348, term4215348.getClass(), "lastPlayDate", null);
        setIntField(term4215348, term4215348.getClass(), "lastPlaceId", 0);
        setField(term4215348, term4215348.getClass(), "lastPlaceName", null);
        setField(term4215348, term4215348.getClass(), "lastRegionId", null);
        setField(term4215348, term4215348.getClass(), "lastRegionName", null);
        setField(term4215348, term4215348.getClass(), "lastAllNetId", null);
        setField(term4215348, term4215348.getClass(), "lastClientId", null);
        setField(term4215348, term4215348.getClass(), "lastCountryCode", null);
        setField(term4215348, term4215348.getClass(), "userNameEx", null);
        setField(term4215348, term4215348.getClass(), "compatibleCmVersion", null);
        setIntField(term4215348, term4215348.getClass(), "medal", 0);
        setIntField(term4215348, term4215348.getClass(), "mapIconId", 0);
        setIntField(term4215348, term4215348.getClass(), "voiceId", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarWear", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarHead", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarFace", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarSkin", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarItem", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarFront", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarBack", 0);
        setIntField(term4215348, term4215348.getClass(), "classEmblemBase", 0);
        setIntField(term4215348, term4215348.getClass(), "classEmblemMedal", 0);
        setIntField(term4215348, term4215348.getClass(), "stockedGridCount", 0);
        setIntField(term4215348, term4215348.getClass(), "exMapLoopCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattlePlayCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleWinCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleLoseCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4215348, term4215348.getClass(), "charaIllustId", 0);
        setIntField(term4215348, term4215348.getClass(), "skillId", 0);
        setIntField(term4215348, term4215348.getClass(), "overPowerPoint", 0);
        setIntField(term4215348, term4215348.getClass(), "overPowerRate", 0);
        setIntField(term4215348, term4215348.getClass(), "overPowerLowerRank", 0);
        setIntField(term4215348, term4215348.getClass(), "avatarPoint", 0);
        setIntField(term4215348, term4215348.getClass(), "battleRankId", 0);
        setIntField(term4215348, term4215348.getClass(), "battleRankPoint", 0);
        setIntField(term4215348, term4215348.getClass(), "eliteRankPoint", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattle1stCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattle2ndCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattle3rdCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattle4thCount", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleCorrection", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleErrCnt", 0);
        setIntField(term4215348, term4215348.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4215348, term4215348.getClass(), "battleRewardStatus", 0);
        setIntField(term4215348, term4215348.getClass(), "battleRewardIndex", 0);
        setIntField(term4215348, term4215348.getClass(), "battleRewardCount", 0);
        setIntField(term4215348, term4215348.getClass(), "ext1", 0);
        setIntField(term4215348, term4215348.getClass(), "ext2", 0);
        setIntField(term4215348, term4215348.getClass(), "ext3", 0);
        setIntField(term4215348, term4215348.getClass(), "ext4", 0);
        setIntField(term4215348, term4215348.getClass(), "ext5", 0);
        setIntField(term4215348, term4215348.getClass(), "ext6", 0);
        setIntField(term4215348, term4215348.getClass(), "ext7", 0);
        setIntField(term4215348, term4215348.getClass(), "ext8", 0);
        setIntField(term4215348, term4215348.getClass(), "ext9", 0);
        setIntField(term4215348, term4215348.getClass(), "ext10", 0);
        setField(term4215348, term4215348.getClass(), "extStr1", null);
        setField(term4215348, term4215348.getClass(), "extStr2", null);
        setLongField(term4215348, term4215348.getClass(), "extLong1", 0L);
        setLongField(term4215348, term4215348.getClass(), "extLong2", 0L);
        setField(term4215348, term4215348.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4215348, term4215348.getClass(), "isNetBattleHost", false);
        setIntField(term4215348, term4215348.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term4215348, args);
    }

};


