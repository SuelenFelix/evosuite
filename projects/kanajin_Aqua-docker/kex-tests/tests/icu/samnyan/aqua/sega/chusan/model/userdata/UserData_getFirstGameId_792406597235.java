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

public class UserData_getFirstGameId_792406597235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4214193;

    public UserData_getFirstGameId_792406597235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4214193 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4214193, term4214193.getClass(), "id", 0L);
        setField(term4214193, term4214193.getClass(), "card", null);
        setField(term4214193, term4214193.getClass(), "userName", null);
        setIntField(term4214193, term4214193.getClass(), "level", 0);
        setIntField(term4214193, term4214193.getClass(), "reincarnationNum", 0);
        setField(term4214193, term4214193.getClass(), "exp", null);
        setLongField(term4214193, term4214193.getClass(), "point", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalPoint", 0L);
        setIntField(term4214193, term4214193.getClass(), "playCount", 0);
        setIntField(term4214193, term4214193.getClass(), "multiPlayCount", 0);
        setIntField(term4214193, term4214193.getClass(), "playerRating", 0);
        setIntField(term4214193, term4214193.getClass(), "highestRating", 0);
        setIntField(term4214193, term4214193.getClass(), "nameplateId", 0);
        setIntField(term4214193, term4214193.getClass(), "frameId", 0);
        setIntField(term4214193, term4214193.getClass(), "characterId", 0);
        setIntField(term4214193, term4214193.getClass(), "trophyId", 0);
        setIntField(term4214193, term4214193.getClass(), "playedTutorialBit", 0);
        setIntField(term4214193, term4214193.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4214193, term4214193.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4214193, term4214193.getClass(), "totalMapNum", 0);
        setLongField(term4214193, term4214193.getClass(), "totalHiScore", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4214193, term4214193.getClass(), "totalUltimaHighScore", 0L);
        setField(term4214193, term4214193.getClass(), "eventWatchedDate", null);
        setIntField(term4214193, term4214193.getClass(), "friendCount", 0);
        setField(term4214193, term4214193.getClass(), "firstGameId", null);
        setField(term4214193, term4214193.getClass(), "firstRomVersion", null);
        setField(term4214193, term4214193.getClass(), "firstDataVersion", null);
        setField(term4214193, term4214193.getClass(), "firstPlayDate", null);
        setField(term4214193, term4214193.getClass(), "lastGameId", null);
        setField(term4214193, term4214193.getClass(), "lastRomVersion", null);
        setField(term4214193, term4214193.getClass(), "lastDataVersion", null);
        setField(term4214193, term4214193.getClass(), "lastLoginDate", null);
        setField(term4214193, term4214193.getClass(), "lastPlayDate", null);
        setIntField(term4214193, term4214193.getClass(), "lastPlaceId", 0);
        setField(term4214193, term4214193.getClass(), "lastPlaceName", null);
        setField(term4214193, term4214193.getClass(), "lastRegionId", null);
        setField(term4214193, term4214193.getClass(), "lastRegionName", null);
        setField(term4214193, term4214193.getClass(), "lastAllNetId", null);
        setField(term4214193, term4214193.getClass(), "lastClientId", null);
        setField(term4214193, term4214193.getClass(), "lastCountryCode", null);
        setField(term4214193, term4214193.getClass(), "userNameEx", null);
        setField(term4214193, term4214193.getClass(), "compatibleCmVersion", null);
        setIntField(term4214193, term4214193.getClass(), "medal", 0);
        setIntField(term4214193, term4214193.getClass(), "mapIconId", 0);
        setIntField(term4214193, term4214193.getClass(), "voiceId", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarWear", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarHead", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarFace", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarSkin", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarItem", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarFront", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarBack", 0);
        setIntField(term4214193, term4214193.getClass(), "classEmblemBase", 0);
        setIntField(term4214193, term4214193.getClass(), "classEmblemMedal", 0);
        setIntField(term4214193, term4214193.getClass(), "stockedGridCount", 0);
        setIntField(term4214193, term4214193.getClass(), "exMapLoopCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattlePlayCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleWinCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleLoseCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4214193, term4214193.getClass(), "charaIllustId", 0);
        setIntField(term4214193, term4214193.getClass(), "skillId", 0);
        setIntField(term4214193, term4214193.getClass(), "overPowerPoint", 0);
        setIntField(term4214193, term4214193.getClass(), "overPowerRate", 0);
        setIntField(term4214193, term4214193.getClass(), "overPowerLowerRank", 0);
        setIntField(term4214193, term4214193.getClass(), "avatarPoint", 0);
        setIntField(term4214193, term4214193.getClass(), "battleRankId", 0);
        setIntField(term4214193, term4214193.getClass(), "battleRankPoint", 0);
        setIntField(term4214193, term4214193.getClass(), "eliteRankPoint", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattle1stCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattle2ndCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattle3rdCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattle4thCount", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleCorrection", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleErrCnt", 0);
        setIntField(term4214193, term4214193.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4214193, term4214193.getClass(), "battleRewardStatus", 0);
        setIntField(term4214193, term4214193.getClass(), "battleRewardIndex", 0);
        setIntField(term4214193, term4214193.getClass(), "battleRewardCount", 0);
        setIntField(term4214193, term4214193.getClass(), "ext1", 0);
        setIntField(term4214193, term4214193.getClass(), "ext2", 0);
        setIntField(term4214193, term4214193.getClass(), "ext3", 0);
        setIntField(term4214193, term4214193.getClass(), "ext4", 0);
        setIntField(term4214193, term4214193.getClass(), "ext5", 0);
        setIntField(term4214193, term4214193.getClass(), "ext6", 0);
        setIntField(term4214193, term4214193.getClass(), "ext7", 0);
        setIntField(term4214193, term4214193.getClass(), "ext8", 0);
        setIntField(term4214193, term4214193.getClass(), "ext9", 0);
        setIntField(term4214193, term4214193.getClass(), "ext10", 0);
        setField(term4214193, term4214193.getClass(), "extStr1", null);
        setField(term4214193, term4214193.getClass(), "extStr2", null);
        setLongField(term4214193, term4214193.getClass(), "extLong1", 0L);
        setLongField(term4214193, term4214193.getClass(), "extLong2", 0L);
        setField(term4214193, term4214193.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4214193, term4214193.getClass(), "isNetBattleHost", false);
        setIntField(term4214193, term4214193.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term4214193, args);
    }

};


