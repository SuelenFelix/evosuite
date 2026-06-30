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

public class UserData_getNetBattlePlayCount_874803499266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282056;

    public UserData_getNetBattlePlayCount_874803499266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282056 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term282056, term282056.getClass(), "id", 0L);
        setField(term282056, term282056.getClass(), "card", null);
        setField(term282056, term282056.getClass(), "userName", null);
        setIntField(term282056, term282056.getClass(), "level", 0);
        setIntField(term282056, term282056.getClass(), "reincarnationNum", 0);
        setField(term282056, term282056.getClass(), "exp", null);
        setLongField(term282056, term282056.getClass(), "point", 0L);
        setLongField(term282056, term282056.getClass(), "totalPoint", 0L);
        setIntField(term282056, term282056.getClass(), "playCount", 0);
        setIntField(term282056, term282056.getClass(), "multiPlayCount", 0);
        setIntField(term282056, term282056.getClass(), "playerRating", 0);
        setIntField(term282056, term282056.getClass(), "highestRating", 0);
        setIntField(term282056, term282056.getClass(), "nameplateId", 0);
        setIntField(term282056, term282056.getClass(), "frameId", 0);
        setIntField(term282056, term282056.getClass(), "characterId", 0);
        setIntField(term282056, term282056.getClass(), "trophyId", 0);
        setIntField(term282056, term282056.getClass(), "playedTutorialBit", 0);
        setIntField(term282056, term282056.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term282056, term282056.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term282056, term282056.getClass(), "totalMapNum", 0);
        setLongField(term282056, term282056.getClass(), "totalHiScore", 0L);
        setLongField(term282056, term282056.getClass(), "totalBasicHighScore", 0L);
        setLongField(term282056, term282056.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term282056, term282056.getClass(), "totalExpertHighScore", 0L);
        setLongField(term282056, term282056.getClass(), "totalMasterHighScore", 0L);
        setLongField(term282056, term282056.getClass(), "totalUltimaHighScore", 0L);
        setField(term282056, term282056.getClass(), "eventWatchedDate", null);
        setIntField(term282056, term282056.getClass(), "friendCount", 0);
        setField(term282056, term282056.getClass(), "firstGameId", null);
        setField(term282056, term282056.getClass(), "firstRomVersion", null);
        setField(term282056, term282056.getClass(), "firstDataVersion", null);
        setField(term282056, term282056.getClass(), "firstPlayDate", null);
        setField(term282056, term282056.getClass(), "lastGameId", null);
        setField(term282056, term282056.getClass(), "lastRomVersion", null);
        setField(term282056, term282056.getClass(), "lastDataVersion", null);
        setField(term282056, term282056.getClass(), "lastLoginDate", null);
        setField(term282056, term282056.getClass(), "lastPlayDate", null);
        setIntField(term282056, term282056.getClass(), "lastPlaceId", 0);
        setField(term282056, term282056.getClass(), "lastPlaceName", null);
        setField(term282056, term282056.getClass(), "lastRegionId", null);
        setField(term282056, term282056.getClass(), "lastRegionName", null);
        setField(term282056, term282056.getClass(), "lastAllNetId", null);
        setField(term282056, term282056.getClass(), "lastClientId", null);
        setField(term282056, term282056.getClass(), "lastCountryCode", null);
        setField(term282056, term282056.getClass(), "userNameEx", null);
        setField(term282056, term282056.getClass(), "compatibleCmVersion", null);
        setIntField(term282056, term282056.getClass(), "medal", 0);
        setIntField(term282056, term282056.getClass(), "mapIconId", 0);
        setIntField(term282056, term282056.getClass(), "voiceId", 0);
        setIntField(term282056, term282056.getClass(), "avatarWear", 0);
        setIntField(term282056, term282056.getClass(), "avatarHead", 0);
        setIntField(term282056, term282056.getClass(), "avatarFace", 0);
        setIntField(term282056, term282056.getClass(), "avatarSkin", 0);
        setIntField(term282056, term282056.getClass(), "avatarItem", 0);
        setIntField(term282056, term282056.getClass(), "avatarFront", 0);
        setIntField(term282056, term282056.getClass(), "avatarBack", 0);
        setIntField(term282056, term282056.getClass(), "classEmblemBase", 0);
        setIntField(term282056, term282056.getClass(), "classEmblemMedal", 0);
        setIntField(term282056, term282056.getClass(), "stockedGridCount", 0);
        setIntField(term282056, term282056.getClass(), "exMapLoopCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattlePlayCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattleWinCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattleLoseCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term282056, term282056.getClass(), "charaIllustId", 0);
        setIntField(term282056, term282056.getClass(), "skillId", 0);
        setIntField(term282056, term282056.getClass(), "overPowerPoint", 0);
        setIntField(term282056, term282056.getClass(), "overPowerRate", 0);
        setIntField(term282056, term282056.getClass(), "overPowerLowerRank", 0);
        setIntField(term282056, term282056.getClass(), "avatarPoint", 0);
        setIntField(term282056, term282056.getClass(), "battleRankId", 0);
        setIntField(term282056, term282056.getClass(), "battleRankPoint", 0);
        setIntField(term282056, term282056.getClass(), "eliteRankPoint", 0);
        setIntField(term282056, term282056.getClass(), "netBattle1stCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattle2ndCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattle3rdCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattle4thCount", 0);
        setIntField(term282056, term282056.getClass(), "netBattleCorrection", 0);
        setIntField(term282056, term282056.getClass(), "netBattleErrCnt", 0);
        setIntField(term282056, term282056.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term282056, term282056.getClass(), "battleRewardStatus", 0);
        setIntField(term282056, term282056.getClass(), "battleRewardIndex", 0);
        setIntField(term282056, term282056.getClass(), "battleRewardCount", 0);
        setIntField(term282056, term282056.getClass(), "ext1", 0);
        setIntField(term282056, term282056.getClass(), "ext2", 0);
        setIntField(term282056, term282056.getClass(), "ext3", 0);
        setIntField(term282056, term282056.getClass(), "ext4", 0);
        setIntField(term282056, term282056.getClass(), "ext5", 0);
        setIntField(term282056, term282056.getClass(), "ext6", 0);
        setIntField(term282056, term282056.getClass(), "ext7", 0);
        setIntField(term282056, term282056.getClass(), "ext8", 0);
        setIntField(term282056, term282056.getClass(), "ext9", 0);
        setIntField(term282056, term282056.getClass(), "ext10", 0);
        setField(term282056, term282056.getClass(), "extStr1", null);
        setField(term282056, term282056.getClass(), "extStr2", null);
        setLongField(term282056, term282056.getClass(), "extLong1", 0L);
        setLongField(term282056, term282056.getClass(), "extLong2", 0L);
        setField(term282056, term282056.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term282056, term282056.getClass(), "isNetBattleHost", false);
        setIntField(term282056, term282056.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattlePlayCount", argTypes, term282056, args);
    }

};


