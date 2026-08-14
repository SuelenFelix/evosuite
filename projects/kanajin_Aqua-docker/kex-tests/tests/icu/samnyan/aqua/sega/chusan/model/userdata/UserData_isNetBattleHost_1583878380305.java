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

public class UserData_isNetBattleHost_1583878380305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219583;

    public UserData_isNetBattleHost_1583878380305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219583 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219583, term4219583.getClass(), "id", 0L);
        setField(term4219583, term4219583.getClass(), "card", null);
        setField(term4219583, term4219583.getClass(), "userName", null);
        setIntField(term4219583, term4219583.getClass(), "level", 0);
        setIntField(term4219583, term4219583.getClass(), "reincarnationNum", 0);
        setField(term4219583, term4219583.getClass(), "exp", null);
        setLongField(term4219583, term4219583.getClass(), "point", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalPoint", 0L);
        setIntField(term4219583, term4219583.getClass(), "playCount", 0);
        setIntField(term4219583, term4219583.getClass(), "multiPlayCount", 0);
        setIntField(term4219583, term4219583.getClass(), "playerRating", 0);
        setIntField(term4219583, term4219583.getClass(), "highestRating", 0);
        setIntField(term4219583, term4219583.getClass(), "nameplateId", 0);
        setIntField(term4219583, term4219583.getClass(), "frameId", 0);
        setIntField(term4219583, term4219583.getClass(), "characterId", 0);
        setIntField(term4219583, term4219583.getClass(), "trophyId", 0);
        setIntField(term4219583, term4219583.getClass(), "playedTutorialBit", 0);
        setIntField(term4219583, term4219583.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219583, term4219583.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219583, term4219583.getClass(), "totalMapNum", 0);
        setLongField(term4219583, term4219583.getClass(), "totalHiScore", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219583, term4219583.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219583, term4219583.getClass(), "eventWatchedDate", null);
        setIntField(term4219583, term4219583.getClass(), "friendCount", 0);
        setField(term4219583, term4219583.getClass(), "firstGameId", null);
        setField(term4219583, term4219583.getClass(), "firstRomVersion", null);
        setField(term4219583, term4219583.getClass(), "firstDataVersion", null);
        setField(term4219583, term4219583.getClass(), "firstPlayDate", null);
        setField(term4219583, term4219583.getClass(), "lastGameId", null);
        setField(term4219583, term4219583.getClass(), "lastRomVersion", null);
        setField(term4219583, term4219583.getClass(), "lastDataVersion", null);
        setField(term4219583, term4219583.getClass(), "lastLoginDate", null);
        setField(term4219583, term4219583.getClass(), "lastPlayDate", null);
        setIntField(term4219583, term4219583.getClass(), "lastPlaceId", 0);
        setField(term4219583, term4219583.getClass(), "lastPlaceName", null);
        setField(term4219583, term4219583.getClass(), "lastRegionId", null);
        setField(term4219583, term4219583.getClass(), "lastRegionName", null);
        setField(term4219583, term4219583.getClass(), "lastAllNetId", null);
        setField(term4219583, term4219583.getClass(), "lastClientId", null);
        setField(term4219583, term4219583.getClass(), "lastCountryCode", null);
        setField(term4219583, term4219583.getClass(), "userNameEx", null);
        setField(term4219583, term4219583.getClass(), "compatibleCmVersion", null);
        setIntField(term4219583, term4219583.getClass(), "medal", 0);
        setIntField(term4219583, term4219583.getClass(), "mapIconId", 0);
        setIntField(term4219583, term4219583.getClass(), "voiceId", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarWear", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarHead", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarFace", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarSkin", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarItem", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarFront", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarBack", 0);
        setIntField(term4219583, term4219583.getClass(), "classEmblemBase", 0);
        setIntField(term4219583, term4219583.getClass(), "classEmblemMedal", 0);
        setIntField(term4219583, term4219583.getClass(), "stockedGridCount", 0);
        setIntField(term4219583, term4219583.getClass(), "exMapLoopCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleWinCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219583, term4219583.getClass(), "charaIllustId", 0);
        setIntField(term4219583, term4219583.getClass(), "skillId", 0);
        setIntField(term4219583, term4219583.getClass(), "overPowerPoint", 0);
        setIntField(term4219583, term4219583.getClass(), "overPowerRate", 0);
        setIntField(term4219583, term4219583.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219583, term4219583.getClass(), "avatarPoint", 0);
        setIntField(term4219583, term4219583.getClass(), "battleRankId", 0);
        setIntField(term4219583, term4219583.getClass(), "battleRankPoint", 0);
        setIntField(term4219583, term4219583.getClass(), "eliteRankPoint", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattle1stCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattle4thCount", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleCorrection", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219583, term4219583.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219583, term4219583.getClass(), "battleRewardStatus", 0);
        setIntField(term4219583, term4219583.getClass(), "battleRewardIndex", 0);
        setIntField(term4219583, term4219583.getClass(), "battleRewardCount", 0);
        setIntField(term4219583, term4219583.getClass(), "ext1", 0);
        setIntField(term4219583, term4219583.getClass(), "ext2", 0);
        setIntField(term4219583, term4219583.getClass(), "ext3", 0);
        setIntField(term4219583, term4219583.getClass(), "ext4", 0);
        setIntField(term4219583, term4219583.getClass(), "ext5", 0);
        setIntField(term4219583, term4219583.getClass(), "ext6", 0);
        setIntField(term4219583, term4219583.getClass(), "ext7", 0);
        setIntField(term4219583, term4219583.getClass(), "ext8", 0);
        setIntField(term4219583, term4219583.getClass(), "ext9", 0);
        setIntField(term4219583, term4219583.getClass(), "ext10", 0);
        setField(term4219583, term4219583.getClass(), "extStr1", null);
        setField(term4219583, term4219583.getClass(), "extStr2", null);
        setLongField(term4219583, term4219583.getClass(), "extLong1", 0L);
        setLongField(term4219583, term4219583.getClass(), "extLong2", 0L);
        setField(term4219583, term4219583.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219583, term4219583.getClass(), "isNetBattleHost", false);
        setIntField(term4219583, term4219583.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNetBattleHost", argTypes, term4219583, args);
    }

};


