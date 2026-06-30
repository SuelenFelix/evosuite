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
import java.lang.Integer;

public class UserData_setVoiceId_149966906354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288886;
     Object term288963;

    public UserData_setVoiceId_149966906354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288886 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288886, term288886.getClass(), "id", 0L);
        setField(term288886, term288886.getClass(), "card", null);
        setField(term288886, term288886.getClass(), "userName", null);
        setIntField(term288886, term288886.getClass(), "level", 0);
        setIntField(term288886, term288886.getClass(), "reincarnationNum", 0);
        setField(term288886, term288886.getClass(), "exp", null);
        setLongField(term288886, term288886.getClass(), "point", 0L);
        setLongField(term288886, term288886.getClass(), "totalPoint", 0L);
        setIntField(term288886, term288886.getClass(), "playCount", 0);
        setIntField(term288886, term288886.getClass(), "multiPlayCount", 0);
        setIntField(term288886, term288886.getClass(), "playerRating", 0);
        setIntField(term288886, term288886.getClass(), "highestRating", 0);
        setIntField(term288886, term288886.getClass(), "nameplateId", 0);
        setIntField(term288886, term288886.getClass(), "frameId", 0);
        setIntField(term288886, term288886.getClass(), "characterId", 0);
        setIntField(term288886, term288886.getClass(), "trophyId", 0);
        setIntField(term288886, term288886.getClass(), "playedTutorialBit", 0);
        setIntField(term288886, term288886.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288886, term288886.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288886, term288886.getClass(), "totalMapNum", 0);
        setLongField(term288886, term288886.getClass(), "totalHiScore", 0L);
        setLongField(term288886, term288886.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288886, term288886.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288886, term288886.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288886, term288886.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288886, term288886.getClass(), "totalUltimaHighScore", 0L);
        setField(term288886, term288886.getClass(), "eventWatchedDate", null);
        setIntField(term288886, term288886.getClass(), "friendCount", 0);
        setField(term288886, term288886.getClass(), "firstGameId", null);
        setField(term288886, term288886.getClass(), "firstRomVersion", null);
        setField(term288886, term288886.getClass(), "firstDataVersion", null);
        setField(term288886, term288886.getClass(), "firstPlayDate", null);
        setField(term288886, term288886.getClass(), "lastGameId", null);
        setField(term288886, term288886.getClass(), "lastRomVersion", null);
        setField(term288886, term288886.getClass(), "lastDataVersion", null);
        setField(term288886, term288886.getClass(), "lastLoginDate", null);
        setField(term288886, term288886.getClass(), "lastPlayDate", null);
        setIntField(term288886, term288886.getClass(), "lastPlaceId", 0);
        setField(term288886, term288886.getClass(), "lastPlaceName", null);
        setField(term288886, term288886.getClass(), "lastRegionId", null);
        setField(term288886, term288886.getClass(), "lastRegionName", null);
        setField(term288886, term288886.getClass(), "lastAllNetId", null);
        setField(term288886, term288886.getClass(), "lastClientId", null);
        setField(term288886, term288886.getClass(), "lastCountryCode", null);
        setField(term288886, term288886.getClass(), "userNameEx", null);
        setField(term288886, term288886.getClass(), "compatibleCmVersion", null);
        setIntField(term288886, term288886.getClass(), "medal", 0);
        setIntField(term288886, term288886.getClass(), "mapIconId", 0);
        setIntField(term288886, term288886.getClass(), "voiceId", 0);
        setIntField(term288886, term288886.getClass(), "avatarWear", 0);
        setIntField(term288886, term288886.getClass(), "avatarHead", 0);
        setIntField(term288886, term288886.getClass(), "avatarFace", 0);
        setIntField(term288886, term288886.getClass(), "avatarSkin", 0);
        setIntField(term288886, term288886.getClass(), "avatarItem", 0);
        setIntField(term288886, term288886.getClass(), "avatarFront", 0);
        setIntField(term288886, term288886.getClass(), "avatarBack", 0);
        setIntField(term288886, term288886.getClass(), "classEmblemBase", 0);
        setIntField(term288886, term288886.getClass(), "classEmblemMedal", 0);
        setIntField(term288886, term288886.getClass(), "stockedGridCount", 0);
        setIntField(term288886, term288886.getClass(), "exMapLoopCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattlePlayCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattleWinCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattleLoseCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288886, term288886.getClass(), "charaIllustId", 0);
        setIntField(term288886, term288886.getClass(), "skillId", 0);
        setIntField(term288886, term288886.getClass(), "overPowerPoint", 0);
        setIntField(term288886, term288886.getClass(), "overPowerRate", 0);
        setIntField(term288886, term288886.getClass(), "overPowerLowerRank", 0);
        setIntField(term288886, term288886.getClass(), "avatarPoint", 0);
        setIntField(term288886, term288886.getClass(), "battleRankId", 0);
        setIntField(term288886, term288886.getClass(), "battleRankPoint", 0);
        setIntField(term288886, term288886.getClass(), "eliteRankPoint", 0);
        setIntField(term288886, term288886.getClass(), "netBattle1stCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattle2ndCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattle3rdCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattle4thCount", 0);
        setIntField(term288886, term288886.getClass(), "netBattleCorrection", 0);
        setIntField(term288886, term288886.getClass(), "netBattleErrCnt", 0);
        setIntField(term288886, term288886.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288886, term288886.getClass(), "battleRewardStatus", 0);
        setIntField(term288886, term288886.getClass(), "battleRewardIndex", 0);
        setIntField(term288886, term288886.getClass(), "battleRewardCount", 0);
        setIntField(term288886, term288886.getClass(), "ext1", 0);
        setIntField(term288886, term288886.getClass(), "ext2", 0);
        setIntField(term288886, term288886.getClass(), "ext3", 0);
        setIntField(term288886, term288886.getClass(), "ext4", 0);
        setIntField(term288886, term288886.getClass(), "ext5", 0);
        setIntField(term288886, term288886.getClass(), "ext6", 0);
        setIntField(term288886, term288886.getClass(), "ext7", 0);
        setIntField(term288886, term288886.getClass(), "ext8", 0);
        setIntField(term288886, term288886.getClass(), "ext9", 0);
        setIntField(term288886, term288886.getClass(), "ext10", 0);
        setField(term288886, term288886.getClass(), "extStr1", null);
        setField(term288886, term288886.getClass(), "extStr2", null);
        setLongField(term288886, term288886.getClass(), "extLong1", 0L);
        setLongField(term288886, term288886.getClass(), "extLong2", 0L);
        setField(term288886, term288886.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288886, term288886.getClass(), "isNetBattleHost", false);
        setIntField(term288886, term288886.getClass(), "netBattleEndState", 0);
        term288963 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288963;
        callMethod(klass, "setVoiceId", argTypes, term288886, args);
    }

};


